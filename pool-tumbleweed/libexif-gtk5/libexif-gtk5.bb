SUMMARY = "GTK Widgets for Viewing EXIF Information"
DESCRIPTION = "This library contains GTK widgets for viewing EXIF information within \
JPEG images created by some digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "libexif-gtk5-0.5.0-1.13.aarch64.rpm"
RPM_HASH = "4a2200f456fcb22b67a61e85827277ee62ee0f3d4d55704286750f5a483f962dc6527f30f284bdc3297d9dc9af3fb714f935a5b76c16bfd5b7b21d1a218507d7"

RPROVIDES:${PN} += "libexif-gtk.so.5 \
libexif-gtk5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif-gtk \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
