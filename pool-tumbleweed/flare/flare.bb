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

RPM_NAME = "flare-1.14-1.4.aarch64.rpm"
RPM_HASH = "f2f3c180b929aa70707d7e7c279a405c0a22da3b134605a9d7d73a36ddc118adc6a897c04a154108638eca13ca13adfaf739b6b5e04fa56e5743b96cde4822ee"

RPROVIDES:${PN} += "flare \
flare-engine"

RDEPENDS:${PN} += "flare-game \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
update-desktop-files"

inherit rpm
