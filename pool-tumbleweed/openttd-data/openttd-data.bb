SUMMARY = "OpenTTD data"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the data files needed by openttd or openttd-dedicated."
LICENSE = "GPL-2.0-only"

PV = "13.1"

RPM_NAME = "openttd-data-13.1-1.2.noarch.rpm"
RPM_HASH = "afd34d77dccb8431e283be4e5eab2a5e67c553c15c3ba01c0a2a636478fbd2629bfa60c0b53977e3fe8823d6563829ae2cc7674f4674032b0a7aafcf3018400e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openttd-data"

RDEPENDS:${PN} += ""

inherit rpm
