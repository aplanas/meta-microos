SUMMARY = "Qt6 QuickTestUtils static library"
DESCRIPTION = "The Qt6 QuickTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quicktestutils-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "66b534b6075f6ea5574c742cee956a182bb3b0018048a4d0242337aee194c534c33c2bb4a943634dfeff4bcadbea07a39e83bdd00596eaee523ef3d0b215c336"

RPROVIDES:${PN} += "cmake-Qt6QuickTestUtilsPrivate \
qt6-quicktestutils-devel-static"

RDEPENDS:${PN} += "cmake-Qt6Network \
cmake-Qt6Quick \
cmake-Qt6QuickTest \
cmake-Qt6Test \
qt6-qml-private-devel"

inherit rpm
