SUMMARY = "AVIF image loader for GTK+ applications"
DESCRIPTION = "A pixbuf-loader plugin to load AVIF images in GTK+ applications."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "gdk-pixbuf-loader-libavif-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "531080a6a47eb9b8cb6a72c5f277631c040f8fce7556b864559f5b77b15fad7f6973f03c650dfaa756f7ca3f171a8e0ec394638d43c62b17a465a0aab1f723ec"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libavif \
libpixbufloader-avif.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.16 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
