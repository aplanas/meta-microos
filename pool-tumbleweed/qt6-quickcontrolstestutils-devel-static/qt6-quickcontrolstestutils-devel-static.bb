SUMMARY = "Qt6 QuickControlsTestUtils static library"
DESCRIPTION = "The Qt6 QuickControlsTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrolstestutils-devel-static-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "9ac897464c76a202f6306c36f02c6a634bd0c6e084e1f032901e7b958e8f9b2cfc83c1a58c225b21ed32a095e39873b4f438d492697b872e52e04bbdee45e47b"

RPROVIDES:${PN} += "cmake-Qt6QuickControlsTestUtilsPrivate \
qt6-quickcontrolstestutils-devel-static"

RDEPENDS:${PN} += "cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickControls2 \
cmake-Qt6QuickTemplates2 \
cmake-Qt6QuickTestUtilsPrivate \
cmake-Qt6Test \
qt6-quickdialogs2quickimpl-private-devel"

inherit rpm
