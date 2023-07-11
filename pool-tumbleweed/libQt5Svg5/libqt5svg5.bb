SUMMARY = "Qt 5 SVG Library"
DESCRIPTION = "The Qt SVG module provides functionality for displaying SVG images \
as a widget, and to create SVG files using drawing commands."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde8"

RPM_NAME = "libQt5Svg5-5.15.10+kde8-1.1.aarch64.rpm"
RPM_HASH = "9769457e3cbc3ab8d4944c42dce74f1a7bc1ba4c0162324eb2cf2e47733f49c0336c998e01bddf6a67636f3c8c0fd744bde97f77344d2b3733dc21cac51fa347"

RPROVIDES:${PN} += "libQt5Svg.so.5 \
libQt5Svg5 \
libqsvg.so \
libqsvgicon.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
