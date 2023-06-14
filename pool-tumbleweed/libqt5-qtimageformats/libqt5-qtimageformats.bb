SUMMARY = "Qt 5 Image Format Plugins"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde9"

RPM_NAME = "libqt5-qtimageformats-5.15.9+kde9-1.1.aarch64.rpm"
RPM_HASH = "b383b2a4d4925f14db356731a212d9f9b47187ffd58c5533138c98693a0220752fc68f350fa8b6b9eb2fc8b512b8de081f5499c23c95ffedf5d906ec8d54a7a6"

RPROVIDES:${PN} += "libqicns.so \
libqmng.so \
libqt5-qtimageformats \
libqtga.so \
libqtiff.so \
libqwbmp.so \
libqwebp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6 \
libm.so.6 \
libmng.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3"

inherit rpm
