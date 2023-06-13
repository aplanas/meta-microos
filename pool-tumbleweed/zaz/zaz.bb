SUMMARY = "Puzzle game about arranging balls in triplets"
DESCRIPTION = "Zaz (Zaz ain't Z***) is a game where the player has to get rid of \
incoming balls by arranging them in triplets. The idea of the game \
is loosely based on games like Luxor, Zuma and Puzzle Bobble. \
The twists that make Zaz stand out from other games of this type are \
that the balls have to be picked from the path \
(insted of being randomly assigned for the player) and that \
the player's 'vehicle' is also attached to a path which is different \
from level to level. \
A 3D accelerator is needed for decent gameplay."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "zaz-1.0.1-2.3.aarch64.rpm"
RPM_HASH = "421ae71ae4325660152dd0b452fb7b16066b8b88b6a47a5645f86e187464968f9fb14030827b05f485943a1431a9735e2b502a07b35285a36bd94e2d77818fb2"

RPROVIDES:${PN} += "application() \
application(zaz.desktop) \
zaz \
zaz(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libftgl.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libogg.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtheoradec.so.1()(64bit) \
libtheoradec.so.1(libtheoradec_1.0)(64bit) \
libtheoraenc.so.1()(64bit) \
libtheoraenc.so.1(libtheoraenc_1.0)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libvorbisfile.so.3()(64bit) \
opengl-games-utils"

inherit rpm
