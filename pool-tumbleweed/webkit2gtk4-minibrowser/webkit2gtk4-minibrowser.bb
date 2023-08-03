SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "webkit2gtk4-minibrowser-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "3221b62f58b6339b573fda286edc59002a1c5d92ef5688db473f74ffa22d5c44eada58e034420825dc46ec5521f080e7d33a84d8d9959ad1b9145ef537b773da"

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
