SUMMARY = "Development files for the Qt5 SVG library"
DESCRIPTION = "You need this package if you want to compile programs with QtSvg."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde8"

RPM_NAME = "libqt5-qtsvg-devel-5.15.10+kde8-1.1.aarch64.rpm"
RPM_HASH = "8ecb8ee1b880218a9800c4cb13896973079d962ce51782d9bf68a121c0de0fa8fc70a4ffe10d12368d77d4e2e4be1e6b0dff78aacee4a590e647bfa6bebd289d"

RPROVIDES:${PN} += "cmake-Qt5Svg \
libQt5Svg-devel \
libqt5-qtsvg-devel \
pkgconfig-Qt5Svg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Svg5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets"

inherit rpm
