SUMMARY = "Qt 6 Charts library - Development files"
DESCRIPTION = "Development files for the Qt 6 Charts library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "04578be96beae5d9c9e6b5b8500735bc010c8ae5966a98d136639cf1b5a8bff74beb614286b8b3dd68507e1d1fa6bae78a1b14a22c6a0435509076a7ac9a5e3a"

RPROVIDES:${PN} += "cmake-Qt6Charts \
pkgconfig-Qt6Charts \
qt6-charts-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6Widgets \
libQt6Charts6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6OpenGLWidgets \
pkgconfig-Qt6Widgets"

inherit rpm
