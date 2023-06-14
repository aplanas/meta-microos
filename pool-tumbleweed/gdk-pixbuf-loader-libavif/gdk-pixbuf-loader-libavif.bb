SUMMARY = "AVIF image loader for GTK+ applications"
DESCRIPTION = "A pixbuf-loader plugin to load AVIF images in GTK+ applications."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "gdk-pixbuf-loader-libavif-0.11.1-2.1.aarch64.rpm"
RPM_HASH = "d5cd4aa236edbc5263360fc6f5931199e5c597131e28d5de04946affb3dd84dcf6aea4a573dd8f692e69aa0f16b6351a0442a05c5c01fd7c784080c4fc5676f9"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libavif \
libpixbufloader-avif.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.15 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
