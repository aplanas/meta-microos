SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Utils that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2utils-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8ff43756aa1f15124a826dcc32f05db09da98798b66116de161354c4440de14ac3479f3eabdf1b777e16ad5fc6b446fe985ae5c36ca514b4f4444507ab5f229a"

RPROVIDES:${PN} += "qt6-quickdialogs2utils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2Utils \
qt6-qmlmodels-private-devel"

inherit rpm
