SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk3-minibrowser-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "8c557bfe03d4e6341174c3dfd8ab832e12487bc0bbd4720cd039d1c178149d0cf776d2f80e7bd625fc243170013ae6eb9f4357bb70e4e216695bf6a7cb00c25c"

RPROVIDES:${PN} += "webkit2gtk3-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
