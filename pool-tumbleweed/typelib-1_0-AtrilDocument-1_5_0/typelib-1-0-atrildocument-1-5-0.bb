SUMMARY = "Introspection bindings for MATE Desktop's AtrilDocument"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-AtrilDocument-1_5_0-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "84a182c240cb4b24ca63eb504b6c64c669ead0e6ba6bd746297b0eea96fda140ed3a2068f525e38309eef4ad043aa1a5b74cc2c45de390d9a260e981da4279fc"

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
