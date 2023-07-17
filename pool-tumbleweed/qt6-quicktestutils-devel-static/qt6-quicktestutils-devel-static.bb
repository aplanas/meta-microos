SUMMARY = "Qt6 QuickTestUtils static library"
DESCRIPTION = "The Qt6 QuickTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktestutils-devel-static-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "642da47614fd3185a75812c6f40041f3f255dcd1d22dcb79347a52bcc7e58b8d646a9f501f901a95eb966792308f26749a63b45f9610e57f4f054cf756c1022d"

RPROVIDES:${PN} += "cmake-Qt6QuickTestUtilsPrivate \
qt6-quicktestutils-devel-static"

RDEPENDS:${PN} += "cmake-Qt6Network \
cmake-Qt6Quick \
cmake-Qt6QuickTest \
cmake-Qt6Test \
qt6-qml-private-devel"

inherit rpm
