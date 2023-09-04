SUMMARY = "2D molecular structures editor"
DESCRIPTION = "The purpose of this editor to help drawing molecules. \
Features: \
 * open, save and import in all formats supported by the OpenBabel library \
 * export to Scalable Vector Graphics (SVG) and a number of common used bitmap \
   formats \
 * print and export your document to PDF"
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "molsketch-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "3440cb5103b326d440c61a48859abfb23952b214076ad5fb2eaafbdfc2d9f24f845970943dc0a3af19e683415d7b04d00f1e02a5a8614228c0ff82f0dad70ba3"

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
