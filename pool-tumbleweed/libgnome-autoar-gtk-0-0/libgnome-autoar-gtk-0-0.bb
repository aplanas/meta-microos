SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "libgnome-autoar-gtk-0-0-0.4.4-1.2.aarch64.rpm"
RPM_HASH = "dd67107cfdc2eae2db5b1d5cca8bbd50516fefc96355827d381e9c2c07b6828a8a74e8513abd3b9f1ccca054fc0f4a6219184bb279bd9fb6b34308326f26d0cd"

RPROVIDES:${PN} += "libgnome-autoar-gtk-0-0 \
libgnome-autoar-gtk-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
