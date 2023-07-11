SUMMARY = "Qt 6 Multimedia library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "aee3305e6b60d3918977757ed05271bd8d1342f3bf6b49c83269d3653e4701f5a43c64a6ac39c6f7fe87b3e03a04ac852d997ffc25c042d2d967a58a44dd9941"

RPROVIDES:${PN} += "cmake-Qt6Multimedia \
pkgconfig-Qt6Multimedia \
qt6-multimedia-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6Multimedia6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Network"

inherit rpm
