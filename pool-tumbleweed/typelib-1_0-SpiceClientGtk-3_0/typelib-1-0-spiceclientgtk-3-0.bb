SUMMARY = "Gtk client and libraries for SPICE remote desktop servers - gi-bindings"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "typelib-1_0-SpiceClientGtk-3_0-0.42-1.5.aarch64.rpm"
RPM_HASH = "1b2aa28280915421db394daea471fe7187940bade318883c258c13f59d9a37495f3a2a47bb24c3419ae8c8c902767f4647309787ffe2f0290d1401dc35f0b34c"

RPROVIDES:${PN} += "typelib-1-0-SpiceClientGtk-3-0 \
typelib-SpiceClientGtk"

RDEPENDS:${PN} += "libspice-client-gtk-3.0.so.5 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-SpiceClientGLib \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
