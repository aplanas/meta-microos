SUMMARY = "Qt 6 ChartsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-chartsqml-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "39a3873a001c97da801922b96305626b715016f92bd8e13003752f5ccb77195309d5b461bb0d3bd4f708f1b6521a8e20b249f8a4368f6886714224a34281d9f1"

RPROVIDES:${PN} += "cmake-Qt6ChartsQml \
pkgconfig-Qt6ChartsQml \
qt6-chartsqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Charts \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6ChartsQml6 \
pkgconfig-Qt6Charts \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
