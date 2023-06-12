SUMMARY = "Qt6 QuickControlsTestUtils static library"
DESCRIPTION = "The Qt6 QuickControlsTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrolstestutils-devel-static-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e8f135bb802a8d4cbc2698ee1fccfb45b9df9a3af35d56bfef31e9fd6d5b94c85d189bf5f0118c8bf5c42285a570ca1f49e27e8af96709e8413d4345f995d618"

RPROVIDES:${PN} += "cmake(Qt6QuickControlsTestUtilsPrivate) \
qt6-quickcontrolstestutils-devel-static \
qt6-quickcontrolstestutils-devel-static(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Qml) \
cmake(Qt6Quick) \
cmake(Qt6QuickControls2) \
cmake(Qt6QuickTemplates2) \
cmake(Qt6QuickTestUtilsPrivate) \
cmake(Qt6Test) \
qt6-quickdialogs2quickimpl-private-devel"

inherit rpm
