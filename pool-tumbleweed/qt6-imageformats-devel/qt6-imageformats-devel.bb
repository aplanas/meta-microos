SUMMARY = "Qt 6 ImageFormats - Development files"
DESCRIPTION = "Development files for the Qt 6 ImageFormats plugins."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-imageformats-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "443eab49d5562d044c6db37e3b27734e60dcc895408a410bfeb1c2d4fd6d650a1150d1b915b8ea03b7d99e459649dca9717c3b9ebf5c24a601d4b55b76b3d862"

RPROVIDES:${PN} += "cmake-Qt6QICNSPlugin \
cmake-Qt6QMngPlugin \
cmake-Qt6QTgaPlugin \
cmake-Qt6QTiffPlugin \
cmake-Qt6QWbmpPlugin \
cmake-Qt6QWebpPlugin \
qt6-imageformats-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libtiff-devel \
pkgconfig-libmng \
pkgconfig-libwebp \
qt6-imageformats"

inherit rpm
