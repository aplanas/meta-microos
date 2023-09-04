SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk3-minibrowser-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "60fa7a37a004ed7df1f5e86301dfce77a43283cc4710f51a52dd345a1238d36b42c7abdd014fa11b814cdafa6f5342c2617257fb3c51b3cc655d558766909b19"

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
