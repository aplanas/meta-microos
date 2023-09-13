SUMMARY = "Introspection bindings for Workrave"
DESCRIPTION = "This package contains typelib files needed for developing plugins for \
Workrave."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "typelib-1_0-Workrave-1_0-1.10.50-2.3.aarch64.rpm"
RPM_HASH = "0a63f2a60de2f0fd5a9fa60ac135b7fa8294d2f3f92d99e395b088523bcb9cb80e42aaceb2ec16458a34b97bb7ac832db7fe7fe74545997de37d4971650c453a"

RPROVIDES:${PN} += "typelib-1-0-Workrave-1-0 \
typelib-Workrave"

RDEPENDS:${PN} += "libworkrave-private-1.0.so.0 \
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
typelib-xlib \
workrave"

inherit rpm
