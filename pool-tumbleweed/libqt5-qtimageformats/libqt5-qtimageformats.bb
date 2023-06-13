SUMMARY = "Qt 5 Image Format Plugins"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde9"

RPM_NAME = "libqt5-qtimageformats-5.15.9+kde9-1.1.aarch64.rpm"
RPM_HASH = "b383b2a4d4925f14db356731a212d9f9b47187ffd58c5533138c98693a0220752fc68f350fa8b6b9eb2fc8b512b8de081f5499c23c95ffedf5d906ec8d54a7a6"

RPROVIDES:${PN} += "libqicns.so()(64bit) \
libqmng.so()(64bit) \
libqt5-qtimageformats \
libqt5-qtimageformats(aarch-64) \
libqtga.so()(64bit) \
libqtiff.so()(64bit) \
libqwbmp.so()(64bit) \
libqwebp.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui5 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmng.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit)"

inherit rpm
