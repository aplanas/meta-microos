SUMMARY = "Qt6 QuickTestUtils static library"
DESCRIPTION = "The Qt6 QuickTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktestutils-devel-static-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "bd01836129dff74552e985fe3aeaa482023e1065dde58a914765fbfd14144004051a58807ab17a44de08b9900b1c815d36b35c65a5e483c7da2a665ad2c475aa"

RPROVIDES:${PN} += "cmake(Qt6QuickTestUtilsPrivate) \
qt6-quicktestutils-devel-static \
qt6-quicktestutils-devel-static(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Qml) \
cmake(Qt6QuickTest) \
cmake(Qt6Test) \
qt6-quick-private-devel"

inherit rpm
