SUMMARY = "A Free/OpenSource brick-breaking game with pretty graphics"
DESCRIPTION = "SDL-Ball is a Free/OpenSource brick-breaking game. \
It is written in C++ using SDL and OpenGL. \
 \
Your mission: To smash your way through a series of progressively harder \
and more tricky levels. Your tools: Ultrakinetic titanium balls and your \
trusty Gruntmazter-3000-Paddle edition. \
 \
Features: \
* 50 levels. \
* OpenGL eye candy. \
* Lots of powerups and powerdowns. \
* Powerup Shop - You get special coins for collecting powerups, \
  you can spend them on more powerups. \
* Highscores. \
* Sound. \
* Level editor. \
* Themes - Selectable from options menu. \
  Themes support loading new gfx,snd and levels. \
  A theme can be partial, if a file is missing, \
  it will be loaded from the default theme. \
  You can even mix between gfx,snd and level themes! \
* Controllable with Mouse/Keyboard/Joystick and WiiMote. \
* Save and Load games \
* Cool Introscreen \
* Screenshot function"
LICENSE = "GPL-3.0-only"

PV = "1.04"

RPM_NAME = "sdl-ball-1.04-1.11.aarch64.rpm"
RPM_HASH = "04c37be4f81bef66c19121336f73665996378539bbd1d0c4cd732617e1ff552fae03df6c69c6b65397c80d1631ee8da3bf240323592d629f6569375f06b1c2cf"

RPROVIDES:${PN} += "application() \
application(sdl-ball.desktop) \
metainfo() \
metainfo(sdl-ball.appdata.xml) \
sdl-ball \
sdl-ball(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libSDL_ttf-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
