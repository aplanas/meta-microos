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

RPM_NAME = "typelib-1_0-GtkSource-5-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "62d5d70e84deb691eb0d38d07832b4940b6061680f4854f2ed066ad8cb1bd926f5547d2bb6df748a17e5a769b500be354d4413b25b685880932104d1752f9c49"

RPROVIDES:${PN} += "typelib(GtkSource) \
typelib-1_0-GtkSource-5 \
typelib-1_0-GtkSource-5(aarch-64)"

RDEPENDS:${PN} += "libgtksourceview-5.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
