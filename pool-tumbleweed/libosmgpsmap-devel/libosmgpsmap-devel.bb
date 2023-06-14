SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles - Development files"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "libosmgpsmap-devel-1.2.0-1.7.aarch64.rpm"
RPM_HASH = "5cfeb6d1e171a4db0b4a4e3a47fc2a8b9dc8573b0291a96bd7fffeebbd859ac8d9538920fefbe5b0ee4ea378a85a2c1fa0ae55b32f9c4d80e595f6d5bfb57cac"

RPROVIDES:${PN} += "libosmgpsmap-devel \
pkgconfig-osmgpsmap-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmgpsmap-1-0-1 \
pkgconfig-gtk+-3.0 \
pkgconfig-libsoup-2.4 \
typelib-1-0-OsmGpsMap-1-0"

inherit rpm
