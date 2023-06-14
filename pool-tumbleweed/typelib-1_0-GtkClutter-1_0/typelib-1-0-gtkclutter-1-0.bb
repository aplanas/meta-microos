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

RPM_NAME = "typelib-1_0-GtkClutter-1_0-1.8.4-5.17.aarch64.rpm"
RPM_HASH = "f4ec0ec1580364c8cc8203ac7a12dcbf301fa3b559b58042433d1ee0d4453fd997af52a29550c702360c24a3d7c8db19adb725e2e8b4942cb6a696ee554da9e2"

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
