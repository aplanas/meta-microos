SUMMARY = "OpenTTD data"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the data files needed by openttd or openttd-dedicated."
LICENSE = "GPL-2.0-only"

PV = "13.4"

RPM_NAME = "openttd-data-13.4-1.1.noarch.rpm"
RPM_HASH = "50e15feb2d86effecfdc955e4834545dbff1e79558c5f0576a538e188d5a06011b66cc1ac24af35133411723f99696b921ff49d2cbf13d719c1989fb9e3e2c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openttd-data"

RDEPENDS:${PN} += ""

inherit rpm
