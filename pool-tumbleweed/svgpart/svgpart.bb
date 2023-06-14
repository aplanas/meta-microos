SUMMARY = "SVG viewer component"
DESCRIPTION = "An SVG viewer component (KPart)."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "svgpart-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "67551724f0e3b52bc4da0a737f439e10657768ce5802ec6f31d5402fa2c91f340b25919daa75fca165084714b693526a7c1a0016d61d24100248c0d7ecb9f6e2"

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
