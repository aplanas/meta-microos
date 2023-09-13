SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk4-minibrowser-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "bbae47a0ca53dcf0a4c383fabb727cd37fd9d85c4a8729b37abe6e1fefb54683e44dc9546a50d3e7e235cbc15d32b97fb8a01fe3b5dda372522f666248ac2525"

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
