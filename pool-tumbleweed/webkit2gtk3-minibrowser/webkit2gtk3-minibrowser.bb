SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit2gtk3-minibrowser-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "ec39e10b5db2e30b9594db2289f36f70bf7f53e25d4041000495b16089549a6d958312141727c1ab387fbf871b82fc69492e55e17ec43aa52da4b43739cd6d00"

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
