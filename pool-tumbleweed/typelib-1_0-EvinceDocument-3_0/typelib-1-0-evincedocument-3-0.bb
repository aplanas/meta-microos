SUMMARY = "Introspection bindings for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "typelib-1_0-EvinceDocument-3_0-44.1-1.1.aarch64.rpm"
RPM_HASH = "2b0d2964ae0efd8680c413f9dc55167c081af329783c769009524b23987daeae75448fa19decedcbcdb05ab6092903422a759bc83d737da9fab74c203c51f518"

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
