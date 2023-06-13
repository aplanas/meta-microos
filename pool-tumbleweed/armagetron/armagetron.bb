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

RPROVIDES:${PN} += "application() \
application(Armagetron.desktop) \
armagetron \
armagetron(aarch-64) \
config(armagetron) \
metainfo() \
metainfo(Armagetron.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.11)(64bit)"

inherit rpm
