SUMMARY = "Introspection bindings for MATE Desktop's AtrilView"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-AtrilView-1_5_0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "551753577937003449d2389aa3738d8cb887b3a39c152e639abcf3425662ea7b9ca8402808c69ecb4d0ac1e56c72d9fb4e5db68454361517b20c3eeb0a351b74"

RPROVIDES:${PN} += "typelib-1-0-AtrilView-1-5-0 \
typelib-AtrilView"

RDEPENDS:${PN} += "libatrilview.so.3 \
typelib-Atk \
typelib-AtrilDocument \
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
