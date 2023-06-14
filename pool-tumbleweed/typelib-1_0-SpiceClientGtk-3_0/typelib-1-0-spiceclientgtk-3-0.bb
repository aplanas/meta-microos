SUMMARY = "Gtk client and libraries for SPICE remote desktop servers - gi-bindings"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "typelib-1_0-SpiceClientGtk-3_0-0.42-1.3.aarch64.rpm"
RPM_HASH = "e96fb5b77c2d961cd4aa757418c56d4e6b068e6323b70e75a4d2b2efc46e953cf620eba402fcdfbf37af24fe33c0bbc653c256a1bb653de939c39cb4f6676523"

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
