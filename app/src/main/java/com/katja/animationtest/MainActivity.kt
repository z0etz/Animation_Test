package com.katja.animationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.katja.animationtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gameView = GameView(this)
        val container = binding.root
        container.addView(gameView)

//        binding.surfaceView.holder.addCallback((GameView(this)))
    }
}