SUMMARY = "Breeze icon theme - rcc file"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme. \
This contains the Breeze (non-dark) icons in a QResource file, used by Kexi."
LICENSE = "LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "breeze5-icons-rcc-5.107.0-1.1.noarch.rpm"
RPM_HASH = "50e745b52b7c0c0cc553c41da253ca510ef594df1ea72e0a4d8419e1cf22d30c7fcfbf3984d78a745a69211d38e58b4994f9312fac7509db0528d21e4d17e2ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-icons-rcc"

RDEPENDS:${PN} += ""

inherit rpm
