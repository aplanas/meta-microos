SUMMARY = "XReaderView -- Introspection Bindings"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "typelib-1_0-XreaderView-1_5-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "6f924313ef91303f5eb7572a4d193076986783264ec2c1abd64eda4f23cd8f7e9c51b68e94b0536aebd4046e9fd336c990bd713f4aacb9fa6555be6d4fe12d8d"

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
