SUMMARY = "Examples for the qt6-svg modules"
DESCRIPTION = "Examples for the qt6-svg modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-svg-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a861fbb5a5f7f40e9b867fc374392cf30984fb5ccb32f8c87d8bf62c7d4c5d00d71e3ee47e48789b0d595327b0d2eba2da125709915abce349aeadb2b4efdc44"

RPROVIDES:${PN} += "qt6-svg-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
