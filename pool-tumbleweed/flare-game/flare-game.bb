SUMMARY = "Free Libre Action Roleplaying Engine — Game"
DESCRIPTION = "Flare (Free Libre Action Roleplaying Engine) is a simple game engine built \
to handle a very specific kind of game: single-player 2D action RPGs. \
Flare is not a reimplementation of an existing game or engine. It is a \
tribute to and exploration of the action RPG genre. \
 \
Rather than building a very abstract, robust game engine, the goal of this \
project is to build several real games and harvest an engine from the common, \
reusable code. The first game, in progress, is a fantasy dungeon crawl. \
 \
Flare uses simple file formats (INI style config files) for most of the \
game data, allowing anyone to easily modify game contents. Open formats \
are preferred (png, ogg). The game code is C++."
LICENSE = "CC-BY-SA-3.0+"

PV = "1.14"

RPM_NAME = "flare-game-1.14-1.2.noarch.rpm"
RPM_HASH = "45c45e099c7f5000fa92dfce4ed26b8747d2befea13e974087abd9c3b9d18d956696e49e1511d8099864345f9ef2b5c083b30bba26692bcc9e5f08ca529b2210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flare-data \
flare-game \
metainfo() \
metainfo(org.flarerpg.Flare.appdata.xml)"
RDEPENDS:${PN} += "flare-engine"

inherit rpm
