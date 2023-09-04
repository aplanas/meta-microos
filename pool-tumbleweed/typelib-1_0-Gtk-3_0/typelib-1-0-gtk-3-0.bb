SUMMARY = "Introspection bindings for the GTK+ toolkit library (version 3)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the GObject Introspection bindings for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "typelib-1_0-Gtk-3_0-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "caf5c4ca4edb6f751beea86d5c9b4604077bca2a2b52404a946b9e753f88c1d8bb61eede205008ab201ee2ac66728e80307336054d172daa0e9f1a0d0babfc1b"

RPROVIDES:${PN} += "typelib-1-0-Gtk-3-0 \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gtk"

RDEPENDS:${PN} += "libgdk-3.so.0 \
libgtk-3.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
