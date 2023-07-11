SUMMARY = "Introspection bindings for libgepub"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.1"

RPM_NAME = "typelib-1_0-Gepub-0_7-0.7.1-1.1.aarch64.rpm"
RPM_HASH = "983ce2b468261953e1119000d442aa9c05f59bf7cdd5a9ed3193506fe39017ab5869b3df118f819771c679760a851671346d31af5012e05fbe89dffc29bf59bb"

RPROVIDES:${PN} += "typelib-1-0-Gepub-0-7 \
typelib-Gepub"

RDEPENDS:${PN} += "libgepub-0.7.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Pango \
typelib-Soup \
typelib-WebKit2 \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
