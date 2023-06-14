SUMMARY = "Introspection bindings for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "typelib-1_0-EvinceView-3_0-44.1-1.1.aarch64.rpm"
RPM_HASH = "df3c645067c4751a0b729b8e1fcc2cb251837097dd7897ec400a054a0f99848f6b8ffcdc66cb635a96a4063fe2076ce9fcc80d9d26b3d72158a420628ffa5ef3"

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
