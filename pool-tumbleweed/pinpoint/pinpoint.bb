SUMMARY = "Simple Presentation Tool for Excellent Presentations"
DESCRIPTION = "Pinpoint a simple presentation tool that hopes to avoid audience death \
by bullet point and instead encourage presentations containing beautiful \
images and small amounts of concise text in slides."
LICENSE = "LGPL-2.1+"

PV = "0.1.8"

RPM_NAME = "pinpoint-0.1.8-1.30.aarch64.rpm"
RPM_HASH = "824d33b657bc8dde8f31c6b71156ae5c9db1568b081bec31fda3a3fc0e54448a5ad06456785c0a4579e264511fbae1c5d5e49756f94e42f2e8725681df71f029"

RPROVIDES:${PN} += "pinpoint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
