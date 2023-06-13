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

RPM_NAME = "supertuxkart-1.4-4.2.aarch64.rpm"
RPM_HASH = "a3233e4c33263cf6f306b7c23673e91f22201a8adfdbcc7fbc87023105bdfce2eb27f7d8c1921ea203d5bc08399a47f83cedd5ee27bfc5ab3d09080f436f1c77"

RPROVIDES:${PN} += "application() \
application(supertuxkart.desktop) \
metainfo() \
metainfo(supertuxkart.appdata.xml) \
supertuxkart \
supertuxkart(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libharfbuzz.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmcpp.so.0()(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libresolv.so.2()(64bit) \
libresolv.so.2(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvorbisfile.so.3()(64bit) \
libwiiuse.so.0()(64bit) \
libz.so.1()(64bit) \
supertuxkart-data"

inherit rpm
