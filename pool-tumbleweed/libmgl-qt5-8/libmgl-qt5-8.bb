SUMMARY = "MathGL Qt5 widget library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-qt5-8-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "cb7edd7c7d4ce3051a74337c2e4d3b4f9b77c6de4ca4e940733809abfe77a5581fb9c4e8b8fcb6ed32f716554a4db2b067e134aee8ee14c65206f4c6868efb87"

RPROVIDES:${PN} += "libmgl-qt5-8 \
libmgl-qt5.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
