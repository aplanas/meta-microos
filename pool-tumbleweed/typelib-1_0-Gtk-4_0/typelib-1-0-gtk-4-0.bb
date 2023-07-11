SUMMARY = "Introspection bindings for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.4"

RPM_NAME = "typelib-1_0-Gtk-4_0-4.10.4-1.2.aarch64.rpm"
RPM_HASH = "9b26a9f592979da7985c69bb583e96346d8e8e4dbc7bc4fc9c387ca57406a2dbc7505a32b8e3c4a073c5c075916131e2a4e61b9605e87a0097468474611379fe"

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
