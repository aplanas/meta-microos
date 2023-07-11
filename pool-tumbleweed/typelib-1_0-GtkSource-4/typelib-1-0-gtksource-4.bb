SUMMARY = "GTK+ Source Editing Widget -- Introspection bindings"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides the GObject Introspection bindings for \
GtkSourceView."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "typelib-1_0-GtkSource-4-4.8.4-1.4.aarch64.rpm"
RPM_HASH = "b53922acf3cc22aefc306bfd1c073343dcb2d4dc4bd2d8a8cd21b8b943572ca05beb6cf0dd0f17fae0884bc56d653428b542b2a823d574887f09fd5ca45b2e85"

RPROVIDES:${PN} += "typelib-1-0-GtkSource-4 \
typelib-GtkSource"

RDEPENDS:${PN} += "libgtksourceview-4.so.0 \
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
