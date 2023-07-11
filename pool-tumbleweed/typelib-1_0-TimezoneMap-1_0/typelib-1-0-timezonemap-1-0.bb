SUMMARY = "GTK+3 timezone map widget - Introspection bindings"
DESCRIPTION = "This package contains the GObject Introspection bindings for \
timezonemap library."
LICENSE = "GPL-3.0-only"

PV = "0.4.4"

RPM_NAME = "typelib-1_0-TimezoneMap-1_0-0.4.4-2.10.aarch64.rpm"
RPM_HASH = "76159db626b35531084788667096aac93b8c37a1c8563713cc2a635b6f7f3e283df7f2cb2cc0c74e42459c70cc9ab903ba9c8d4ff967e6c492e227aff19ddd3f"

RPROVIDES:${PN} += "typelib-1-0-TimezoneMap-1-0 \
typelib-TimezoneMap"

RDEPENDS:${PN} += "libtimezonemap.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
