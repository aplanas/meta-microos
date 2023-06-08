SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "breeze-5.27.4-2.1.aarch64.rpm"
RPM_HASH = "3eae23ed195a1fea2a31d3316b420e8e1c8cf9a2cff3c14da5b9e6bcd5fc6a0025c2c4b5180922893f560663cd39a73fbd0dd6a91dd12cb0b922c291a01274e0"

RPROVIDES:${PN} += "breeze breeze(aarch-64)"
RDEPENDS:${PN} += "breeze5-cursors breeze5-icons breeze5-style"

inherit rpm
