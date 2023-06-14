SUMMARY = "Qt 6 SVGWidgets library"
DESCRIPTION = "The Qt 6 SvgWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6SvgWidgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c0c480cff9bb5c8bb605f4aa1561c15e1de3b3a2b43f49bf91540d6ee127459112779cfdfd3e934b697927be35797900e001cfeaa2800ecb302e78fca45fc889"

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
