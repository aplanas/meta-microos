SUMMARY = "Set TrueType interpreter to version 35"
DESCRIPTION = "System environment for set TrueType interpreter to version 35. \
In release 2.6.4, a new hinting mode for TrueType fonts was added, \
which enabled by default to activate sub-pixel hinting for TrueType. \
This broke the work of full hinting. This optional package with a bash profile \
that will switch the TrueType Interpreter to the old version 35."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.1"

RPM_NAME = "freetype2-profile-tti35-2.13.1-1.1.noarch.rpm"
RPM_HASH = "b513070c6d5ec64f97ac318f2c57ac90b076bfff744517460ef5f050ff43c8d039349564db0c1f79ec308d8a8be7d875455406239bef05aefece0c0c4c562b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-freetype2-profile-tti35 \
freetype2-profile-tti35"

RDEPENDS:${PN} += "bash \
freetype2"

inherit rpm
