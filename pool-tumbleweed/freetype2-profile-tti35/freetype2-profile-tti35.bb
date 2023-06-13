SUMMARY = "Set TrueType interpreter to version 35"
DESCRIPTION = "System environment for set TrueType interpreter to version 35. \
In release 2.6.4, a new hinting mode for TrueType fonts was added, \
which enabled by default to activate sub-pixel hinting for TrueType. \
This broke the work of full hinting. This optional package with a bash profile \
that will switch the TrueType Interpreter to the old version 35."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "freetype2-profile-tti35-2.13.0-4.1.noarch.rpm"
RPM_HASH = "b0e476273797471dad3613f158f96680087274eef787484d0a615cb10b1ac287e2679103e6e358727df89c56c7c8bac9e6a6e53e8d6c48a8cb49cd8e3857f10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(freetype2-profile-tti35) \
freetype2-profile-tti35"

RDEPENDS:${PN} += "bash \
freetype2"

inherit rpm
