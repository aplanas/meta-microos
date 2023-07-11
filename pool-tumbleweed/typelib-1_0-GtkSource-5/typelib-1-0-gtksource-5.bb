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

PV = "5.8.0"

RPM_NAME = "typelib-1_0-GtkSource-5-5.8.0-1.2.aarch64.rpm"
RPM_HASH = "06f24c10434720d570921d757956a00fd3a5f3eedaa35fd137cff95a7d3e0f9ef5900b3eec8e41109c3a464b90255c9639314e71ba8b336bbe181711115acd74"

RPROVIDES:${PN} += "typelib-1-0-GtkSource-5 \
typelib-GtkSource"

RDEPENDS:${PN} += "libgtksourceview-5.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
