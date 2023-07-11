SUMMARY = "Introspection bindings for the GTK+ source editing widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides the GObject Introspection bindings for \
GtkSourceView."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "typelib-1_0-GtkSource-3_0-3.24.11-3.10.aarch64.rpm"
RPM_HASH = "931f2be1bcf84c09c0fb940744669b7b80842d325381714ab2eeed7f4d7555742814d4da0dbaa021153641cba408d834317447b801a8afa4ffad8da1a4ffa7fd"

RPROVIDES:${PN} += "typelib-1-0-GtkSource-3-0 \
typelib-GtkSource"

RDEPENDS:${PN} += "libgtksourceview-3.0.so.1 \
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
