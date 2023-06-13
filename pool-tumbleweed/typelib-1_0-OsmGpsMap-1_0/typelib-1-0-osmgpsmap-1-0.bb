SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "typelib-1_0-OsmGpsMap-1_0-1.2.0-1.7.aarch64.rpm"
RPM_HASH = "810f5ac3de701febc08910434ec7c203565cacf1496f7d7d3b35ed63f0cb3f13cac70d855cf142315aacab1fce4edcc4f6ccf52e3532a19c0c34bcc0f3226724"

RPROVIDES:${PN} += "typelib(OsmGpsMap) \
typelib-1_0-OsmGpsMap-1_0 \
typelib-1_0-OsmGpsMap-1_0(aarch-64)"

RDEPENDS:${PN} += "libosmgpsmap-1.0.so.1()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
