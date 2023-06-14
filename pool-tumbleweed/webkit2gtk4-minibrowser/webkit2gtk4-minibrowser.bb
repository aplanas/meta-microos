SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkit2gtk4-minibrowser-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "c5f320315473866a1112f7f52e14a06a0766a244a4ee94c4dc2a170fdd6a0c9e7ace4c83ef91ccc583d8465b6f6f4f5342bf25eeddbfdb25953a0fd5e10d00b2"

RPROVIDES:${PN} += "webkit2gtk4-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libjavascriptcoregtk-6.0.so.1 \
libsoup-3.0.so.0 \
libstdc++.so.6 \
libwebkitgtk-6.0.so.4"

inherit rpm
