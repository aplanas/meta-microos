SUMMARY = "Introspection bindings for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides the GObject Introspection bindings for VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "typelib-1_0-Vte-2_91-0.72.1-2.2.aarch64.rpm"
RPM_HASH = "ef39181cc20c8a414cdc84428bb393ee3f5e98a21dda2a38306520c068518167cd892d68a9ac63ac2c1502bf6aafe5835296378582a019e6f561fa269c391041"

RPROVIDES:${PN} += "typelib(Vte) \
typelib-1_0-Vte-2_91 \
typelib-1_0-Vte-2_91(aarch-64)"

RDEPENDS:${PN} += "libvte-2.91.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
