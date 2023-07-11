SUMMARY = "Introspection bindings for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "typelib-1_0-EvinceDocument-3_0-44.3-1.1.aarch64.rpm"
RPM_HASH = "e2146bb8bf3e2e166b35e402968c30408a5517971b92c0569365809ac4f8c3c0f4fd378bdb2f3576fbcdd12e7a5a572a407ef3efb244acec1b3c7e2e19378e73"

RPROVIDES:${PN} += "typelib-1-0-EvinceDocument-3-0 \
typelib-EvinceDocument"

RDEPENDS:${PN} += "libevdocument3.so.4 \
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
