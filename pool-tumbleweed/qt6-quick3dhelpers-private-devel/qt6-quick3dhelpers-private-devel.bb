SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpers library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpers that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dhelpers-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "33d18f6eb24200baa1d8065cdefbe7376d296cdb63582203dd49d2c647745aa3899781ab6ce5c89b0748e24c691597fe4577118410e2b311cb0a2701ae41c3b7"

RPROVIDES:${PN} += "qt6-quick3dhelpers-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpers"

inherit rpm
