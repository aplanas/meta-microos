SUMMARY = "Graphics, music, cars and tracks for Ultimate Stunts"
DESCRIPTION = "This package contains the game data for Ultimate Stunts. \
 \
Ultimate Stunts is a remake of the famous DOS game 'Stunts'. Racing in \
Ultimate Stunts involves some really spectacular stunts, like \
loopings, corkscrews, bridges to jump over, etc. You can also design \
your own tracks."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.7.1"

RPM_NAME = "ultimatestunts-data-0.7.7.1-2.4.noarch.rpm"
RPM_HASH = "f896db7e5b41ee21309541fb504463ce399b8e09a657e5cfcf60d4c840946f6006a186557c8479d418112e757820c52b89fc5817700bb143e369e20ffc5d3206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ultimatestunts-data"

RDEPENDS:${PN} += ""

inherit rpm
