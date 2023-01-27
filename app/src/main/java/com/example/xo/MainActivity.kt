package com.example.xo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xo.databinding.ActivityMainBinding
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val board: Array<Array<String>> = Array(3) { Array(3) { "" } }
    private val symX = "X"
    private val symO = "O"
    private var i by Delegates.notNull<Int>()
    private var j by Delegates.notNull<Int>()

    private fun rand() {
        i = (0..2).random()
        j = (0..2).random()
    }

    private fun showSym() {
        binding.button00.text = board[0][0]
        binding.button01.text = board[0][1]
        binding.button02.text = board[0][2]
        binding.button10.text = board[1][0]
        binding.button11.text = board[1][1]
        binding.button12.text = board[1][2]
        binding.button20.text = board[2][0]
        binding.button21.text = board[2][1]
        binding.button22.text = board[2][2]
    }

    private fun botMove() {
        rand()
        if (board[i][j] == symX || board[i][j] == symO) {
            botMove()
        }
        board[i][j] = symO
        showSym()
        onStart()
    }

    fun winCond() {
        if (binding.button00.text.equals("X") && binding.button01.text.equals("X") && binding.button02.text.equals(
                "X"
            )
        ) binding.tvWin.text = "you won1"
        if (binding.button10.text.equals("X") && binding.button11.text.equals("X") && binding.button12.text.equals(
                "X"
            )
        ) binding.tvWin.text = "you won1"
        if (binding.button20.text.equals("X") && binding.button21.text.equals("X") && binding.button22.text.equals(
                "X"
            )
        ) binding.tvWin.text = "you won1"
        if (binding.button00.text.equals("X") && binding.button10.text.equals("X") && binding.button20.text.equals(
                "X"
            )
        ) binding.tvWin.text = "you won1"
        if (binding.button01.text.equals("X") && binding.button11.text.equals("X") && binding.button21.text.equals(
                "X"
            )
        ) binding.tvWin.text = "you won1"
        if (binding.button02.text.equals("X") && binding.button12.text.equals("X") && binding.button22.text.equals(
                "X"
            )
        ) binding.tvWin.text = "you won1"
        if (binding.button00.text.equals("X") && binding.button11.text.equals("X") && binding.button22.text.equals(
                "X"
            )
        ) binding.tvWin.text = "you won1"
        if (binding.button02.text.equals("X") && binding.button11.text.equals("X") && binding.button20.text.equals(
                "X"
            )
        ) binding.tvWin.text = "bot won1"
        if (binding.button00.text.equals("O") && binding.button01.text.equals("O") && binding.button02.text.equals(
                "O"
            )
        ) binding.tvWin.text = "bot won1"
        if (binding.button10.text.equals("O") && binding.button11.text.equals("O") && binding.button12.text.equals(
                "O"
            )
        ) binding.tvWin.text = "bot won1"
        if (binding.button20.text.equals("O") && binding.button21.text.equals("O") && binding.button22.text.equals(
                "O"
            )
        ) binding.tvWin.text = "bot won1"
        if (binding.button00.text.equals("O") && binding.button10.text.equals("O") && binding.button20.text.equals(
                "O"
            )
        ) binding.tvWin.text = "bot won1"
        if (binding.button01.text.equals("O") && binding.button11.text.equals("O") && binding.button21.text.equals(
                "O"
            )
        ) binding.tvWin.text = "bot won1"
        if (binding.button02.text.equals("O") && binding.button12.text.equals("O") && binding.button22.text.equals(
                "O"
            )
        ) binding.tvWin.text = "bot won1"
        if (binding.button00.text.equals("O") && binding.button11.text.equals("O") && binding.button22.text.equals(
                "O"
            )
        ) binding.tvWin.text = "bot won1"
        if (binding.button02.text.equals("O") && binding.button11.text.equals("O") && binding.button20.text.equals(
                "O"
            )
        ) binding.tvWin.text = "bot won1"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button00.setOnClickListener {
            board[0][0] = symX
            binding.button00.isEnabled = false
            botMove()
            winCond()
        }

        binding.button01.setOnClickListener {

            board[0][1] = symX
            binding.button01.isEnabled = false
            botMove()
            winCond()
        }

        binding.button02.setOnClickListener {
            board[0][2] = symX
            binding.button02.isEnabled = false
            botMove()
            winCond()
        }

        binding.button10.setOnClickListener {

            board[1][0] = symX
            binding.button10.isEnabled = false
            botMove()
            winCond()
        }

        binding.button11.setOnClickListener {
            board[1][1] = symX
            binding.button11.isEnabled = false
            botMove()
            winCond()
        }

        binding.button12.setOnClickListener {
            board[1][2] = symX
            binding.button12.isEnabled = false
            botMove()
            winCond()
        }

        binding.button20.setOnClickListener {
            board[2][0] = symX
            binding.button20.isEnabled = false
            botMove()
            winCond()
        }

        binding.button21.setOnClickListener {
            board[2][1] = symX
            binding.button21.isEnabled = false
            botMove()
            winCond()
        }

        binding.button22.setOnClickListener {
            board[2][2] = symX
            binding.button22.isEnabled = false
            botMove()
            winCond()
        }

    }
}