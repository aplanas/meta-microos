SUMMARY = "Introspection bindings for MATE Desktop's AtrilView"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-AtrilView-1_5_0-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "acba8badd1c7785a22b0499048b0da35197655aa891421739492d7c38348a73587f4168294853c5527bac47936a16714a09ab079d65fedf93558d242218d33b0"

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
