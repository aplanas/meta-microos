SUMMARY = "GTK Tool for Viewing EXIF Information"
DESCRIPTION = "This tool contains simple GTK interface for viewing EXIF information \
within JPEG images created by some digital cameras."
LICENSE = "LGPL-2.1+"

PV = "0.5"

RPM_NAME = "gexif-0.5-204.31.aarch64.rpm"
RPM_HASH = "9b29da298250d5d5d5e06b909a34220e4255f1f88194afe65027d02685136144c7555e048dbe897d3d6b1ac6570214dc54b87b29c26e5b8df03d29ecb6721007"

RPROVIDES:${PN} += "gexif"

RDEPENDS:${PN} += "gexif-lang \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif-gtk.so.5 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
