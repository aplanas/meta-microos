SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "libgnome-autoar-0-0-0.4.4-1.2.aarch64.rpm"
RPM_HASH = "d3da670df508f5e6d225105f90726140576d6ea82f7cede3f18a0be5a1a55de5db638f81e11e9e8b2400c342080edfd0af3b88c964d6bf836f185a80db490496"

RPROVIDES:${PN} += "libgnome-autoar-0-0 \
libgnome-autoar-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
