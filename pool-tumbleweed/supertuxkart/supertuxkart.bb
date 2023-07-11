SUMMARY = "A 3D kart racing game"
DESCRIPTION = "SuperTuxKart is a Free 3d kart racing game. \
 \
The focus of the game is more to be fun than it is to be realistic. \
You can play with up to 4 friends on one PC, racing against each other or just try to beat the computer. \
 \
See the great lighthouse or drive through the sand and visit the pyramids. Race underground or in space, \
watching the stars passing by. Have some rest under the palms on the beach (watching the other karts \
overtaking you :) ). But don't eat the bananas! Watch for bowling balls, plungers, bubble gum and cakes thrown by opponents. \
 \
You can do a single race against other karts, compete in one of several Grand Prix, try to beat the high score in time trials \
on your own, play battle mode against your friends, and more!"
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "supertuxkart-1.4-4.3.aarch64.rpm"
RPM_HASH = "7ef74ce4755bb105c5796826b8b1a7dc6e8dfa892f21f256bf94b2de443a46877c7032044a566d137dfc40109421f0c45a1ba3c372e5d3c46f425205b6177bac"

RPROVIDES:${PN} += "supertuxkart"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libharfbuzz.so.0 \
libjpeg.so.8 \
libm.so.6 \
libmcpp.so.0 \
libopenal.so.1 \
libpng16.so.16 \
libresolv.so.2 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libwiiuse.so.0 \
libz.so.1 \
supertuxkart-data"

inherit rpm
