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

RPM_NAME = "zaz-1.0.1-2.4.aarch64.rpm"
RPM_HASH = "53c0783d6e368f8ca36d231c2339d0809f3848f8a39d54fea92a53210ca1e8e73742879ed40fe558a2f353f6def03b618c615fbe4e920a5f1ad8a095a2ba0476"

RPROVIDES:${PN} += "zaz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libc.so.6 \
libftgl.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libstdc++.so.6 \
libtheoradec.so.1 \
libtheoraenc.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
opengl-games-utils"

inherit rpm
