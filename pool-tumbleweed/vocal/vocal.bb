SUMMARY = "A podcast client for the desktop"
DESCRIPTION = "A podcast application designed for Elementary OS and other GTK-based \
Linux desktops. Includes a built-in video player, automatic updating, \
smart library management, library importing and exporting, custom \
skip intervals, and more."
LICENSE = "GPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "vocal-2.4.2-5.5.aarch64.rpm"
RPM_HASH = "d2c21197cba7069c04ccdf8db6fbb723bdf3b784588ee106b8624445205de8a07255b638f0b222bc8547438928d6e8a14df75d64e7ffd0db42aa7b9a0fab91bc"

RPROVIDES:${PN} += "vocal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libnotify.so.4 \
libsoup-2.4.so.1 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
