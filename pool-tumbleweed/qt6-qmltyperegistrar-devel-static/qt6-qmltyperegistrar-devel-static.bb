SUMMARY = "Qt6 QmlTypeRegistrar static library"
DESCRIPTION = "The Qt6 QmlTypeRegistrar static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmltyperegistrar-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "e0206df1d9168497d9b6c462509de6e86723013dcc318b4f29d2193a861f9b3d8b7c99508df4c5306c0976d939df31c24b399692dbc3b7d41c690a4cd338741a"

RPROVIDES:${PN} += "cmake-Qt6QmlTypeRegistrarPrivate \
qt6-qmltyperegistrar-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
