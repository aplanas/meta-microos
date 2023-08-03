SUMMARY = "Qt 6 SVG libraries - Development files"
DESCRIPTION = "Development files for the Qt 6 SVG libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-svg-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7b7ea8a3b5e1b1e35a9944d2d2660aeb1c24b3fa6b0f9b59f84b6c7cc27fd4302cc7b79f45d47546481036d7db7dd75ec215a42bc059d23e61d9ac20f3bcf915"

RPROVIDES:${PN} += "cmake-Qt6QSvgIconPlugin \
cmake-Qt6QSvgPlugin \
cmake-Qt6Svg \
cmake-Qt6SvgWidgets \
pkgconfig-Qt6Svg \
pkgconfig-Qt6SvgWidgets \
qt6-svg-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libQt6Svg6 \
libQt6SvgWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Svg \
pkgconfig-Qt6Widgets"

inherit rpm
