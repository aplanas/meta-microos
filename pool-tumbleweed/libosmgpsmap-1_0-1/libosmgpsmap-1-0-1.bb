SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "libosmgpsmap-1_0-1-1.2.0-1.7.aarch64.rpm"
RPM_HASH = "6a46b43f7190af2cf67cb9f7d7deab6ab0824ea4a041e2954d7b0727e32aa96c9a43c6687da075fe883131a6e0c7b1408d0d5a3697b31f3cbcafd7fe85ac6a65"

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
