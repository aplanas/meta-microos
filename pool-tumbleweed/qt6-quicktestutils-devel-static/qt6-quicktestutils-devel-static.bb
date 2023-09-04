SUMMARY = "Qt6 QuickTestUtils static library"
DESCRIPTION = "The Qt6 QuickTestUtils static library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quicktestutils-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "14b0d48c60db39b83e11395af444996231e895eded57427d314beea0d16f1434391b1e70a600e6d5d148427af0161c1d3214ab3ce042f271795c0a105bb63fa5"

RPROVIDES:${PN} += "cmake-Qt6QuickTestUtilsPrivate \
qt6-quicktestutils-devel-static"

RDEPENDS:${PN} += "cmake-Qt6Network \
cmake-Qt6Quick \
cmake-Qt6QuickTest \
cmake-Qt6Test \
qt6-qml-private-devel"

inherit rpm
