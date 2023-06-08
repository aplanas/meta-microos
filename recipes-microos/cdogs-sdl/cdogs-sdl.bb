SUMMARY = "Classic overhead run-and-gun game"
DESCRIPTION = "C-Dogs SDL is a classic overhead run-and-gun game, supporting up to \
4 players in co-op and deathmatch modes. Customize your player, choose \
from up to 11 weapons, and try over 100 user-created campaigns. Have fun!"
LICENSE = "BSD-2-Clause & GPL-2.0-only & CC-BY-3.0 & CC-BY-SA-3.0"

PV = "1.4.1"

RPM_NAME = "cdogs-sdl-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "c380371e5835fa94ea056fda5af6c87eefdd424d5c6f63f47876f38a8804d5845ce8e2a65b45859fb6a77f9ab1b8554e1f75625901cefdd614c1cff386f7ccbd"

RPROVIDES:${PN} += "application() application(io.github.cxong.cdogs-sdl.desktop) cdogs-sdl cdogs-sdl(aarch-64) metainfo() metainfo(io.github.cxong.cdogs-sdl.appdata.xml)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenGL.so.0()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2_image-2.0.so.0()(64bit) libSDL2_mixer-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libenet.so.7()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
