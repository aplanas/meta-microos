SUMMARY = "3D racing game with ponies - data files"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game. \
 \
 This package contains architecture-independent game data"
LICENSE = "GPL-3.0+ & CC-BY-SA-3.0 & CC-BY-3.0 & OFL-1.1 & CC0-1.0"

PV = "1.4.1"

RPM_NAME = "pink-pony-data-1.4.1-2.22.noarch.rpm"
RPM_HASH = "b748a8d2fe7174542a22147f97a3beea101853aa9c1edf5741a64d1623781e036e1519c7344b96a7911604a6b1f1fa33546c0df5b3641880c3e70aa31b0042eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pink-pony-data"

RDEPENDS:${PN} += "pink-pony"

inherit rpm
