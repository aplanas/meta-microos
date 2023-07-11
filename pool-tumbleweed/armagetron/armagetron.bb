SUMMARY = "OpenGL Game Similar to the Film Tron"
DESCRIPTION = "In this game, race against other players on a permanently moving \
lightcycle (virtual motorbike), which leaves a wall as a trace. The \
lightcycles can make 90 degree turns and accelerate when driven close \
to walls. The game is over if you hit a wall. The goal of the game is \
to try to make your enemies hit the walls, while you avoid doing the \
same. Unlike glTron, this program does not require 3D hardware support."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.8.3.5"

RPM_NAME = "armagetron-0.2.8.3.5-1.16.aarch64.rpm"
RPM_HASH = "ba9c4c393ec668473bb778b786ae97eb61cc81b4257d097bbd1e47df024e8249020001e414a59f2c1f44c4ce4e56131c931213f0d941459c60c9d082374665ba"

RPROVIDES:${PN} += "armagetron \
config-armagetron"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
