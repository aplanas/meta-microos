SUMMARY = "Legacy data for kbd package"
DESCRIPTION = "The kbd-legacy package contains original keymaps for kbd package. \
Please note that kbd-legacy is not helpful without kbd."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.6.2"

RPM_NAME = "kbd-legacy-2.6.2-1.1.noarch.rpm"
RPM_HASH = "36acd114b47bc2af9f4885a47ae38dbf8c6b3cb00718a0c3631b08270b10cb02fad1deb9622585824eca33ac4d0c6afa97cc1e2d8f04118e6c1dc97da1ebeea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbd-legacy"

RDEPENDS:${PN} += ""

inherit rpm
