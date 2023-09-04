SUMMARY = "libgedit-gtksourceview's GObject introspection bindings"
DESCRIPTION = "The GObject introspection bindings for libgedit-gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "299.0.3"

RPM_NAME = "typelib-1_0-GtkSource-300-299.0.3-1.1.aarch64.rpm"
RPM_HASH = "22d4b2dbf362e8dcd279045839e4a3a5410d992e789f8a2130060377b6a7cb2bf7d50f3ba2dc1596a2f1e78aa9c4247d89ecc8539f8469324ac30bf890653c95"

RPROVIDES:${PN} += "typelib-1-0-GtkSource-300 \
typelib-GtkSource"

RDEPENDS:${PN} += "libgedit-gtksourceview-300.so.0 \
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
