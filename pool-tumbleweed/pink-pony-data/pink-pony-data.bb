SUMMARY = "3D racing game with ponies - data files"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game. \
 \
 This package contains architecture-independent game data"
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & GPL-3.0-or-later & OFL-1.1 & CC0-1.0"

PV = "1.4.1"

RPM_NAME = "pink-pony-data-1.4.1-3.2.noarch.rpm"
RPM_HASH = "db861e361f1d7483c30b5296f345a14e281d7c432d1f23526823f810077f57e6b19a8c84b91b764a7c25ef5f8c918a17a3e625341b4862641c4246cc28702b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pink-pony-data"

RDEPENDS:${PN} += "pink-pony"

inherit rpm
