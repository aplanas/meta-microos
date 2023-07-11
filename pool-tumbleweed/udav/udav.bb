SUMMARY = "Data handling and plotting tool"
DESCRIPTION = "UDAV is a program for data array visualization using the MathGL \
library. It support a wide spectrum of graphics, a simple script \
language and visual data handling and editing. It has a window \
interface for data viewing, changing and plotting. It can also \
execute MGL scripts, set up, rotate graphics, and so on."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "udav-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "a2fb84364651e01398f16fcbc337980c7eb3de83f7933c2872692c8f199213ad4b07629862f030e1f82d95123be8861553fef2ef802679b333a7fb2444527c3b"

RPROVIDES:${PN} += "udav"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5.so.200 \
libm.so.6 \
libmgl-fltk.so.8 \
libmgl-qt5.so.8 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
