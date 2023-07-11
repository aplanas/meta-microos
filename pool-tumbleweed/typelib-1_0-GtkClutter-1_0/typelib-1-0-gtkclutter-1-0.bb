SUMMARY = "Introspection bindings for the GTK+ Clutter integration"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GTK+ enables the use of GTK+ with Clutter. \
 \
This package provides the GObject Introspection bindings for Clutter \
GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "typelib-1_0-GtkClutter-1_0-1.8.4-5.18.aarch64.rpm"
RPM_HASH = "804c306d3eac0dcc88b16ab882aa55f315733e333a616d81e42ef7bae1bdff661a784e1a32562f2ceeb07e2f389069b9e77a1a4404a4e29b42995fd0ad9d4123"

RPROVIDES:${PN} += "typelib-1-0-GtkClutter-1-0 \
typelib-GtkClutter"

RDEPENDS:${PN} += "libclutter-gtk-1.0.so.0 \
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
