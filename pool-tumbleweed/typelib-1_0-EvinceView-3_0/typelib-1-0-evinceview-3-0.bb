SUMMARY = "Introspection bindings for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "typelib-1_0-EvinceView-3_0-44.3-1.1.aarch64.rpm"
RPM_HASH = "84f88ae6d4e7afdd6eecf91ffbf3e71962e1b08ce43340ccf961d1918c794e016fba8bcd1819cb04ceab5dccfb781bb5dc298917aa8ec77e223e9661d0fd97fb"

RPROVIDES:${PN} += "typelib-1-0-EvinceView-3-0 \
typelib-EvinceView"

RDEPENDS:${PN} += "libevdocument3.so.4 \
libevview3.so.3 \
typelib-Atk \
typelib-EvinceDocument \
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
