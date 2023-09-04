SUMMARY = "XReaderView -- Introspection Bindings"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "typelib-1_0-XreaderView-1_5-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "6c63ce7f67289453f2eace152f4a829feb80f3ad50cf494b12f0cb0bace8c00b081f7ca8a729454b8d3a996c4fe7105d93ef5419d8b297e554a9bb06f1fe9508"

RPROVIDES:${PN} += "typelib-1-0-XreaderView-1-5 \
typelib-1-0-XreaderView-1-5-0 \
typelib-XreaderView"

RDEPENDS:${PN} += "libxreaderview.so.3 \
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
typelib-XreaderDocument \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
