SUMMARY = "Introspection bindings for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "typelib-1_0-Gtk-4_0-4.12.0-2.1.aarch64.rpm"
RPM_HASH = "8e5f39af45d80e95b38f428945c24f6afdd579290b55ee3d02c7a07fc6f1360bb4f4ee1aa11b96291d3c9d9191151e44dd21fb4673216f1881b8b1bef527acf0"

RPROVIDES:${PN} += "typelib-1-0-Gtk-4-0 \
typelib-Gdk \
typelib-GdkWayland \
typelib-GdkX11 \
typelib-Gsk \
typelib-Gtk"

RDEPENDS:${PN} += "libgtk-4.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
