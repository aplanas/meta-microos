SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "webkit2gtk3-soup2-minibrowser-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "89ded5fed64037616fd09471df362003f9470f7204619c64ed3b78d4573957d6c2b4721efac7297485e07869f9bec6a52ae46c316ccf4c3bb06d90d8a51c4959"

RPROVIDES:${PN} += "webkit2gtk3-soup2-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.0.so.18 \
libsoup-2.4.so.1 \
libwebkit2gtk-4.0.so.37"

inherit rpm
