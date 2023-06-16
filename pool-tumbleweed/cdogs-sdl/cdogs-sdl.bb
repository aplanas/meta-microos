SUMMARY = "Classic overhead run-and-gun game"
DESCRIPTION = "C-Dogs SDL is a classic overhead run-and-gun game, supporting up to \
4 players in co-op and deathmatch modes. Customize your player, choose \
from up to 11 weapons, and try over 100 user-created campaigns. Have fun!"
LICENSE = "BSD-2-Clause & GPL-2.0-only & CC-BY-3.0 & CC-BY-SA-3.0"

PV = "1.4.2"

RPM_NAME = "cdogs-sdl-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "2f709e59bcb1e208a063eb5fbdd64b283aa3ce4393dfd9bb893e51f2faa67f4f15dd8ba8f7354558c56d1b039b59fb8d51314de9d1dfb168b0a8b564ebc3280d"

RPROVIDES:${PN} += "cdogs-sdl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libenet.so.7 \
libm.so.6"

inherit rpm
