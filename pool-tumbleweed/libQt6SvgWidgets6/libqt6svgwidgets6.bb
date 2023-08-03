SUMMARY = "Qt 6 SVGWidgets library"
DESCRIPTION = "The Qt 6 SvgWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6SvgWidgets6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e461f2620275e48011710bf35ba973352be2541b62f1b3b23afcaa1d00f35a93dcde62d0d18969d18749f8f9afaa30930479afd2ecafe736d5ea27f300929ef1"

RPROVIDES:${PN} += "libQt6SvgWidgets.so.6 \
libQt6SvgWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
