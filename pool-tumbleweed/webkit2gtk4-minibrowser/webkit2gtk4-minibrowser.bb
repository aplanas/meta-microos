SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk4-minibrowser-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "7f1b0ca303a5f798b4f0a868c4839df60e3333c01714a90547f5ca02ec98639e593fa0a9e67a706100b5e76db5e6c0e5aafeeff56f674408ed069b322e9c50a4"

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
