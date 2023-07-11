SUMMARY = "Introspection bindings for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides the GObject Introspection bindings for VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.2"

RPM_NAME = "typelib-1_0-Vte-2_91-0.72.2-1.1.aarch64.rpm"
RPM_HASH = "b95912e2ba9995893dcd138a1a679ba79e001503f4a5edcc37014726db4d563a13e4970e96dc22fc37e2dfbbda3cbf9c0b4db3b610afd285c2590d120e210b70"

RPROVIDES:${PN} += "typelib-1-0-Vte-2-91 \
typelib-Vte"

RDEPENDS:${PN} += "libvte-2.91.so.0 \
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
