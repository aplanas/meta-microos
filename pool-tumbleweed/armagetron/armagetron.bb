SUMMARY = "OpenGL Game Similar to the Film Tron"
DESCRIPTION = "In this game, race against other players on a permanently moving \
lightcycle (virtual motorbike), which leaves a wall as a trace. The \
lightcycles can make 90 degree turns and accelerate when driven close \
to walls. The game is over if you hit a wall. The goal of the game is \
to try to make your enemies hit the walls, while you avoid doing the \
same. Unlike glTron, this program does not require 3D hardware support."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.8.3.5"

RPM_NAME = "armagetron-0.2.8.3.5-1.15.aarch64.rpm"
RPM_HASH = "c4f4827fab8ce5711b7be16e5cd6ba9bbc62391fb940958a880a6a8fef4a5cc207640fa9c06655bffe44ba7345b9a9dc4d1864ae3cb542f8077b83145edb0d2c"

RPROVIDES:${PN} += "armagetron \
config-armagetron"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
coreutils \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
