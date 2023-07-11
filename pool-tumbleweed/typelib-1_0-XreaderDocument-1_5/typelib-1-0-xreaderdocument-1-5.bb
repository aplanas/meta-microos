SUMMARY = "XReaderDocument -- Introspection Bindings"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "typelib-1_0-XreaderDocument-1_5-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "b5ad6be7b3ad275d7f784c33e0120cc8f1ed4deb7def725d63ea53a2c6d19b3ecd8a3f32f5f6ea2e1233b9834d02ccf91cd3f8430a799b51a4430d442ea10fd9"

RPROVIDES:${PN} += "typelib-1-0-XreaderDocument-1-5 \
typelib-1-0-XreaderDocument-1-5-0 \
typelib-XreaderDocument"

RDEPENDS:${PN} += "libxreaderdocument.so.3 \
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
