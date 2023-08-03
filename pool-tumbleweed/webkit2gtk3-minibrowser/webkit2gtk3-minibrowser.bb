SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "webkit2gtk3-minibrowser-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "e1bcb63a98be3d1c44c34f558b6927c49e10b81affce2753965faa99f686ddfc9558927eb0579504e760872c47bf776760ce836fbb2a7379779ff4951b59665f"

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
