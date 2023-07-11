SUMMARY = "Introspection bindings for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides the GObject Introspection bindings for VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.2"

RPM_NAME = "typelib-1_0-Vte-3_91-0.72.2-1.1.aarch64.rpm"
RPM_HASH = "56e04442298ba07a0c765983512d206e96fd669a211a5cbd62cff861cd4aaddec74f41a229c6aa84debe87b89982236299b6c401f2acd4be7857d7a82a1e649b"

RPROVIDES:${PN} += "typelib-1-0-Vte-3-91 \
typelib-Vte"

RDEPENDS:${PN} += "libvte-2.91-gtk4.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
