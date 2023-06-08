SUMMARY = "Set TrueType interpreter to version 35"
DESCRIPTION = "System environment for set TrueType interpreter to version 35. \
In release 2.6.4, a new hinting mode for TrueType fonts was added, \
which enabled by default to activate sub-pixel hinting for TrueType. \
This broke the work of full hinting. This optional package with a bash profile \
that will switch the TrueType Interpreter to the old version 35."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "freetype2-profile-tti35-2.13.0-3.1.noarch.rpm"
RPM_HASH = "3bc3bc500544a423a7c8414a67f6b89fdca86111b2f40ca2375aa693b107060f94bf43eb32bd98e465fc72fdbb802bea0a8defb8a8cec52f4658073ecf995656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(freetype2-profile-tti35) freetype2-profile-tti35"
RDEPENDS:${PN} += "bash freetype2"

inherit rpm
