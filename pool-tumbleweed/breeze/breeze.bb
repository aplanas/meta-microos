SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "breeze-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "cfa9afe160e48f6d9f1b3a89e1ecaf6d5a7a0ab57197b12936e753af7fe0bb90050bb1fc928f7934d84bc140b6fc8c3bfcf3d37bf715eb07354697eaccf723db"

RPROVIDES:${PN} += "breeze"

RDEPENDS:${PN} += "breeze5-cursors \
breeze5-icons \
breeze5-style"

inherit rpm
