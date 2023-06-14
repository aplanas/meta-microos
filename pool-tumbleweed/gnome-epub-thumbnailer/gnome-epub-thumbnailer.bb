SUMMARY = "Thumbnailer for EPub books"
DESCRIPTION = "Thumbnailer for EPub books."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "gnome-epub-thumbnailer-1.7-1.3.aarch64.rpm"
RPM_HASH = "0dd2a00c8556272cd8c09277717a29e79571bfb1ce84049e2f44973d6a9e3fa47eda10418bfb8d52eb05c24efc3b3971e615c27d35b1c95b34034da6c03fb3c0"

RPROVIDES:${PN} += "gnome-epub-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.2"

inherit rpm
