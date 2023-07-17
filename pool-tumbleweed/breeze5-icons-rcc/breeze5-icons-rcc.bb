SUMMARY = "Breeze icon theme - rcc file"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme. \
This contains the Breeze (non-dark) icons in a QResource file, used by Kexi."
LICENSE = "LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "breeze5-icons-rcc-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "fc2b24cbcd2fe5abf194dd4cca2f267b23a79a389b5f51c5d333da665cdbbcd264816f94e336e83b61587db9de4fbabfe3f3cc37535469de8d3bcdacf9b2fe36"

RPROVIDES:${PN} += "breeze5-icons-rcc"

RDEPENDS:${PN} += ""

inherit rpm
