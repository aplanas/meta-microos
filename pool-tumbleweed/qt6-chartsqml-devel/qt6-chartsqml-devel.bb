SUMMARY = "Qt 6 ChartsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-chartsqml-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9e7e7c055164cba4e5501f224c22b1a86b6d4847a461dcb3c341a3edc6bbc6e3d6a1053fb15cfa8a8d8dbb6f5e57778ab7a5fb778a031fc202ef7ea9c557bba3"

RPROVIDES:${PN} += "cmake(Qt6ChartsQml) \
pkgconfig(Qt6ChartsQml) \
qt6-chartsqml-devel \
qt6-chartsqml-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Charts) \
cmake(Qt6OpenGL) \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
libQt6ChartsQml6 \
pkgconfig(Qt6Charts) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6OpenGL) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick)"

inherit rpm
