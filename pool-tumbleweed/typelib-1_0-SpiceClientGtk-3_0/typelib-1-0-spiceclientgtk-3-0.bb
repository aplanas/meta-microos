SUMMARY = "Gtk client and libraries for SPICE remote desktop servers - gi-bindings"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "typelib-1_0-SpiceClientGtk-3_0-0.42-2.1.aarch64.rpm"
RPM_HASH = "6f4541427e0dc00eb78665f530f646da942dc91d228f44c3dd7e7dc1766d8cd48194226e634bbe99a5e0e2845be466cc5c9464a2c5d5eb71b7e59221f079b7cc"

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
