SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles - Development files"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "libosmgpsmap-devel-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "25445a64b36ac1e7dbd8cec0916b7803fac9064b789359e97832536ee9372b3770383a853c50c8480dd99c70e4a29e7ddf7abd5e9f05ffdb16709f2c651fbcbf"

RPROVIDES:${PN} += "libosmgpsmap-devel \
pkgconfig-osmgpsmap-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmgpsmap-1-0-1 \
pkgconfig-gtk+-3.0 \
pkgconfig-libsoup-2.4 \
typelib-1-0-OsmGpsMap-1-0"

inherit rpm
