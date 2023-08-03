SUMMARY = "Qt6 QuickControlsTestUtils static library"
DESCRIPTION = "The Qt6 QuickControlsTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrolstestutils-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b351c28d4ab6c995051b2b5074d84df82a8069797a3d4a7f9abb4da2e4bbe80b0bd09545c2e0829c89bd5cac08171d5e2b7820bf5905256183e5a883eef1d206"

RPROVIDES:${PN} += "cmake-Qt6QuickControlsTestUtilsPrivate \
qt6-quickcontrolstestutils-devel-static"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2 \
cmake-Qt6QuickDialogs2QuickImpl \
cmake-Qt6Test \
qt6-quick-private-devel \
qt6-quickdialogs2quickimpl-private-devel \
qt6-quicktemplates2-private-devel \
qt6-quicktestutils-devel-static"

inherit rpm
