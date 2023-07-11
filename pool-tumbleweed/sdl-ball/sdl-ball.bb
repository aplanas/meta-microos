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

RPM_NAME = "sdl-ball-1.04-1.12.aarch64.rpm"
RPM_HASH = "9a2533350c2bcd8a9bcdfd15e388a8387379eee4ccf25f45c9dc64297253fb7e3fd84af822a1732109240a4f6a15027b27375fdbacb246d764a4e376ce2b43ff"

RPROVIDES:${PN} += "sdl-ball"

RDEPENDS:${PN} += "/usr/bin/sh \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
