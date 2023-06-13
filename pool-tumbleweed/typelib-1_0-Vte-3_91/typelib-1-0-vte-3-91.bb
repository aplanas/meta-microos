SUMMARY = "Introspection bindings for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides the GObject Introspection bindings for VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "typelib-1_0-Vte-3_91-0.72.1-2.2.aarch64.rpm"
RPM_HASH = "3ed910229b03703c2365a40e7a7e611b6043e254d9ab1cedf36182b6e8b0a848cdf745d078465e5831bcb25ac09082e951a0ca5123debf12e9525f535a87360b"

RPROVIDES:${PN} += "typelib(Vte) \
typelib-1_0-Vte-3_91 \
typelib-1_0-Vte-3_91(aarch-64)"

RDEPENDS:${PN} += "libvte-2.91-gtk4.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
