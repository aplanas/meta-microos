SUMMARY = "SVG viewer component"
DESCRIPTION = "An SVG viewer component (KPart)."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "svgpart-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "04bf71a8c95a7310bee8eed33306b8075b1832de50896caf89f27602215141a99d2d15dec2c1175ca84a002af650389c7b1de700c2a268fc12d79d3a90cb597c"

RPROVIDES:${PN} += "svgpart"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Parts.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
