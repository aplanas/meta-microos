SUMMARY = "GTK+ integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GTK+ enables the use of GTK+ with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "libclutter-gtk-1_0-0-1.8.4-5.18.aarch64.rpm"
RPM_HASH = "60f96b0f46f542cdec06f9685788a5e0fd9a4f2d454585f5d77d50d95077073e05c5a7ecd0f6476e6070cb20ff51502607e81bef15e1b751a5d32f17c895a998"

RPROVIDES:${PN} += "clutter-gtk \
libclutter-gtk-1-0-0 \
libclutter-gtk-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libcogl.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwayland-client.so.0"

inherit rpm
