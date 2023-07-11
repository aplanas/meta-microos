SUMMARY = "2D molecular structures editor"
DESCRIPTION = "The purpose of this editor to help drawing molecules. \
Features: \
 * open, save and import in all formats supported by the OpenBabel library \
 * export to Scalable Vector Graphics (SVG) and a number of common used bitmap \
   formats \
 * print and export your document to PDF"
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "molsketch-0.7.3-1.4.aarch64.rpm"
RPM_HASH = "af21f734bcd5cef4b8aedc97f927f853ad68fbaaacb607006041cb8c76cbb2f6762bcb17bf01046a8219eae215d5e8bfbb1d4fb1f561ba3a69cc580c781d9b85"

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
