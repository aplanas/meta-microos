SUMMARY = "3D racing game with ponies - data files"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game. \
 \
 This package contains architecture-independent game data"
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & GPL-3.0-or-later & OFL-1.1 & CC0-1.0"

PV = "1.4.1"

RPM_NAME = "pink-pony-data-1.4.1-3.1.noarch.rpm"
RPM_HASH = "6ce8cefc15d8cace547eb5b1fac15e6bd714975acb729a20d6e177109e6f1b28a5994f1800f256b8ce9b0ad5b6e2e5c626570b31a42011106d7227e0a2d9caa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pink-pony-data"

RDEPENDS:${PN} += "pink-pony"

inherit rpm
