SUMMARY = "AVIF image loader for GTK+ applications"
DESCRIPTION = "A pixbuf-loader plugin to load AVIF images in GTK+ applications."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "gdk-pixbuf-loader-libavif-0.11.1-2.2.aarch64.rpm"
RPM_HASH = "d66e55298ee5a88b462e716aa88fa5774d745bb1064961bdf13f3402c6b80c1acd613112de5f186619b298ec7d56a178b3b1b2d87035ed6e7f588abdb1381059"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libavif \
libpixbufloader-avif.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.15 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
