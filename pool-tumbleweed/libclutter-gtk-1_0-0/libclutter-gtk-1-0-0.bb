SUMMARY = "GTK+ integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GTK+ enables the use of GTK+ with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "libclutter-gtk-1_0-0-1.8.4-5.17.aarch64.rpm"
RPM_HASH = "ee2a2d9d7d1eb9707ffe40880ddc1497892ceb726a8e9c84646cce763923e8cd67139272f459c03866fc906469e763f603facb846970d412d8e4b895fe8f5704"

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
