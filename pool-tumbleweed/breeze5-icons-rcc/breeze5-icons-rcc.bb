SUMMARY = "Breeze icon theme - rcc file"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme. \
This contains the Breeze (non-dark) icons in a QResource file, used by Kexi."
LICENSE = "LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "breeze5-icons-rcc-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "24ac7abc45b2ef199146e3a9af53e4a5326d371e63ff56f5a2a571eb4b3c4fa9231a58d09a671c49c3f83e87eb8812d85ecfdba82ff13dec72c1725c883826d6"

RPROVIDES:${PN} += "breeze5-icons-rcc"

RDEPENDS:${PN} += ""

inherit rpm
