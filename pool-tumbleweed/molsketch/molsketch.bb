SUMMARY = "2D molecular structures editor"
DESCRIPTION = "The purpose of this editor to help drawing molecules. \
Features: \
 * open, save and import in all formats supported by the OpenBabel library \
 * export to Scalable Vector Graphics (SVG) and a number of common used bitmap \
   formats \
 * print and export your document to PDF"
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "molsketch-0.7.3-1.3.aarch64.rpm"
RPM_HASH = "d1c46d112958d9df224df5affdaa39fb031fb31703c77dbd336f39f5bc4e1395eabfcbe13e182c9c2e0a1599a73c13cc268ccd3041d3403d77191e88afc01c73"

RPROVIDES:${PN} += "libmolsketch.so \
libobabeliface.so \
molsketch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenbabel.so.7 \
libstdc++.so.6"

inherit rpm
