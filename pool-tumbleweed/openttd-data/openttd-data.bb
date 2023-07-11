SUMMARY = "OpenTTD data"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the data files needed by openttd or openttd-dedicated."
LICENSE = "GPL-2.0-only"

PV = "13.3"

RPM_NAME = "openttd-data-13.3-1.1.noarch.rpm"
RPM_HASH = "03c02f92ff068e555b5c8e9acd2060876c45a70221955a4b68de0f96b3bdeea4ff9a95dbab72f0d2a0fc3f0a5acf8ccfa349298620c8ae701873f653620294c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openttd-data"

RDEPENDS:${PN} += ""

inherit rpm
