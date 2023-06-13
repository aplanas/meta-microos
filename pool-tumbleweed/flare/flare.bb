SUMMARY = "Free Libre Action Roleplaying Engine"
DESCRIPTION = "Flare (Free Libre Action Roleplaying Engine) is a game engine built \
to handle a very specific kind of game: single-player 2D action RPGs. \
Flare is not a reimplementation of an existing game or engine. It is a \
tribute to and exploration of the action RPG genre. \
 \
The usecase of this project is to build several real games and \
reuse code. The first game, in progress, is a fantasy dungeon crawl. \
 \
Flare uses .ini-style config files for most of the \
game data to modify game contents. The game code is C++."
LICENSE = "(CC-BY-SA-3.0 | CC-BY-SA-4.0) & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "flare-1.14-1.3.aarch64.rpm"
RPM_HASH = "acec35639f9d07d0f60cc19f9aa8bbff8111323450036c1a18887d6e199e90220109b853ff4d90b0c7040bfafe137184071d477308287ef381bbcd41dce772e4"

RPROVIDES:${PN} += "application() \
application(flare.desktop) \
flare \
flare(aarch-64) \
flare-engine"

RDEPENDS:${PN} += "flare-game \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
update-desktop-files"

inherit rpm
