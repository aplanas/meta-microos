SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit2gtk4-minibrowser-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "33d198d894a5c09b76f647f30cc69a6dd92431b6e7c3f24b5d29adee7a4a1ec18e15602bc1a823f0496a2a7096849ca620ff45d151f7a7a9eb0704a9f9e451e7"

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
