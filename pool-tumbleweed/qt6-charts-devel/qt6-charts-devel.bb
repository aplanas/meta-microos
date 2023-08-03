SUMMARY = "Qt 6 Charts library - Development files"
DESCRIPTION = "Development files for the Qt 6 Charts library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-charts-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a88060133b1af28b698112b4356843d54253f8217c77af03665bcd15aacd1694ffa85db485a3bc68720797a4087c83b455339d5bd6a53773ab7693b4f411d46c"

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
