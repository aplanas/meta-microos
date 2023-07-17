SUMMARY = "Qt6 QuickControlsTestUtils static library"
DESCRIPTION = "The Qt6 QuickControlsTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrolstestutils-devel-static-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "cb7c1f7f7d3809f3d49f68d8cc9acd873db058b84bf4b84f1f3a0ee9db9ad76ae789f1c807a58a26da5702a252a5aa7ae7169f849a70377c8b93f770b91d4b31"

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
