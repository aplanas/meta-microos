SUMMARY = "Library to display maps -- Introspection bindings"
DESCRIPTION = "Libchamplain is a C library providing a ClutterActor to display maps. It \
also provides a Gtk+ widget to display maps in Gtk+ applications. \
 \
This package provides the GObject Introspection bindings for \
libchamplain."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.21"

RPM_NAME = "typelib-1_0-Champlain-0_12-0.12.21-1.4.aarch64.rpm"
RPM_HASH = "cbb1a55abb791eec317916a030a0126ecc711cbaaff6531d0beb1136e1ab8a20cecdff5559140b2a486485cec703e8e417cee485c6b04dca79c269318ad67635"

RPROVIDES:${PN} += "typelib-1-0-Champlain-0-12 \
typelib-Champlain \
typelib-GtkChamplain"

RDEPENDS:${PN} += "libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
typelib-Atk \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
