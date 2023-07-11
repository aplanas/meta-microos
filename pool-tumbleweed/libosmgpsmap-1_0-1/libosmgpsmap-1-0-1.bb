SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "libosmgpsmap-1_0-1-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "70d695277d872d610f9eec655d6db1a45dc1133be021cb6f531dee6637dbf23d9d150ad6d9c525d270fd2b13e5f341ba64e77c60832d91ee9eb7a827d2cc421b"

RPROVIDES:${PN} += "libosmgpsmap-1-0-1 \
libosmgpsmap-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libsoup-2.4.so.1"

inherit rpm
