SUMMARY = "Qt6 QuickControlsTestUtils static library"
DESCRIPTION = "The Qt6 QuickControlsTestUtils static library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrolstestutils-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "d85089479dd322a8da17b9d75ad4e7fe2a219df9c84870d8835bad130d925d5339cc19cf8570e402628ba20880be569e81b45a2aa50d143c46374b42eca77021"

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
