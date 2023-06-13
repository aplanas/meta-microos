SUMMARY = "Classic overhead run-and-gun game"
DESCRIPTION = "C-Dogs SDL is a classic overhead run-and-gun game, supporting up to \
4 players in co-op and deathmatch modes. Customize your player, choose \
from up to 11 weapons, and try over 100 user-created campaigns. Have fun!"
LICENSE = "BSD-2-Clause & GPL-2.0-only & CC-BY-3.0 & CC-BY-SA-3.0"

PV = "1.4.2"

RPM_NAME = "cdogs-sdl-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "2f709e59bcb1e208a063eb5fbdd64b283aa3ce4393dfd9bb893e51f2faa67f4f15dd8ba8f7354558c56d1b039b59fb8d51314de9d1dfb168b0a8b564ebc3280d"

RPROVIDES:${PN} += "application() \
application(io.github.cxong.cdogs-sdl.desktop) \
cdogs-sdl \
cdogs-sdl(aarch-64) \
metainfo() \
metainfo(io.github.cxong.cdogs-sdl.appdata.xml)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libOpenGL.so.0()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libenet.so.7()(64bit) \
libm.so.6()(64bit)"

inherit rpm
