SUMMARY = "Qt 5 Image Format Plugins"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde9"

RPM_NAME = "libqt5-qtimageformats-5.15.10+kde9-1.1.aarch64.rpm"
RPM_HASH = "a1de3241ebfc08098cd856d8ed8ec3d9695de0e65ae0f9aa41e319a7835825ceb747cdeb6d9b815e54032e9b93ba6af8c7d871c43432d962cd84b9f63efb316d"

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
