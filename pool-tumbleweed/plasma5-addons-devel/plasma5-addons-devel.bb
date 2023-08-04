SUMMARY = "Additional plasmoid widgets - development files"
DESCRIPTION = "This package contains development files to develop additional widgets for \
the Plasma desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "plasma5-addons-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "7a07bdeeb1c7744f2f9504ba9def17cd63c6da8550742ea345eb42a1152a6fcb7ae23fa3c6e39c39c2a090e4b3e7f6e18339cfdb7b48d729ef62f8cc2a430b6c"

RPROVIDES:${PN} += "cmake-PlasmaPotdProvider \
plasma5-addons-devel"

RDEPENDS:${PN} += "plasma5-addons"

inherit rpm
