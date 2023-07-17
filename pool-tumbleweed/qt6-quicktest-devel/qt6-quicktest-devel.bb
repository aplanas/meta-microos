SUMMARY = "Qt 6 QuickTest library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktest-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "9dd8f0053075c1acd54cd66370c2d9e5a96a4d760fa9d6adf70fee51402e416493f0335a2ef5c7b44f9a292153e38898b332e5bb5a1cb7e70f78c5694db80999"

RPROVIDES:${PN} += "cmake-Qt6QuickTest \
pkgconfig-Qt6QuickTest \
qt6-quicktest-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Test \
libQt6QuickTest6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Test"

inherit rpm
