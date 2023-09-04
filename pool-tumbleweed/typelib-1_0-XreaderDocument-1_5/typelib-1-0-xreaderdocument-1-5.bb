SUMMARY = "XReaderDocument -- Introspection Bindings"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "typelib-1_0-XreaderDocument-1_5-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "a83ac6f6f47469bdbad7680eadafdc495484cf3b9e8042c5a1b6235a0809c28e6f3c0ecf9af70c6b0898a81b338a1db503d5c76f160481651f526a6591644d78"

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
