SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "typelib-1_0-OsmGpsMap-1_0-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "5974807ee5db02217e748c55d5429d949b58bf5a20ab8db0904ebf6dc18ac8925e3088e76d6167a09e993fe1662e3abed9a2ff12c6fbecd003d84fd4a1c47e4b"

RPROVIDES:${PN} += "typelib-1-0-OsmGpsMap-1-0 \
typelib-OsmGpsMap"

RDEPENDS:${PN} += "libosmgpsmap-1.0.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
