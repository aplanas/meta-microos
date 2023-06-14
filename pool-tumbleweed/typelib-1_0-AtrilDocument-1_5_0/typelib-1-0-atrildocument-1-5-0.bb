SUMMARY = "Introspection bindings for MATE Desktop's AtrilDocument"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-AtrilDocument-1_5_0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "bb924384a89eeaa86d1e63ae678a1d8e7658f9b57c3693498f684499eb9d9a367b28412612f9bd473f2a292a00e1d737f196cc80f69234408810618bbaf15dab"

RPROVIDES:${PN} += "typelib-1-0-AtrilDocument-1-5-0 \
typelib-AtrilDocument"

RDEPENDS:${PN} += "libatrildocument.so.3 \
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
