SUMMARY = "Pipe connecting action puzzle game"
DESCRIPTION = "You get a limited number of pipes on each level and need to combine \
them such that water from the house at the top of the screen can flow \
to the storage tank at the bottom. Points will be awarded per each \
pipe segment through which water flows, and the goal of the game is \
to reach a high score. Some of the levels also have obstacles where \
pipes cannot be placed. The game is playable with joystick/joypad as \
well."
LICENSE = "GPL-2.0+"

PV = "1.10_svn23"

RPM_NAME = "vodovod-1.10_svn23-3.25.aarch64.rpm"
RPM_HASH = "3a052235b869dd19c09cf29d5777e4214526b0490ce5de62aff57f314bd20c99d5afe35e2871502df624e8e55252695adbde5b12325af9108aa6bb3e2d76fde2"

RPROVIDES:${PN} += "vodovod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
