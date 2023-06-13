SUMMARY = "3D racing game with ponies - data files"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game. \
 \
 This package contains architecture-independent game data"
LICENSE = "GPL-3.0+ & CC-BY-SA-3.0 & CC-BY-3.0 & OFL-1.1 & CC0-1.0"

PV = "1.4.1"

RPM_NAME = "pink-pony-data-1.4.1-2.21.noarch.rpm"
RPM_HASH = "6c21dc93b0e537a1775b74da367ad6da630213723edb9f5cbc4753297c4cda0f99ea8d0c9cf6abbd5c48ee40fcaada4f5fecd3f2ed0be122a93ffc7fe2f4c440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pink-pony-data"

RDEPENDS:${PN} += "pink-pony"

inherit rpm
