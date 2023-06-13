SUMMARY = "Introspection bindings for the GTK+ spell checker library"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the GObject Introspection bindings for gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "typelib-1_0-Gspell-1-1.12.1-1.2.aarch64.rpm"
RPM_HASH = "9e77f96e2294723589ad3a52db0109cabc7b11bc8f4430e048b7b7013ad50e937939900f30a4aa0b59ec48bcbe70975ee3fb3f056e9afd77b16b951b2575fbe9"

RPROVIDES:${PN} += "typelib(Gspell) \
typelib-1_0-Gspell-1 \
typelib-1_0-Gspell-1(aarch-64)"

RDEPENDS:${PN} += "libgspell-1.so.2()(64bit) \
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
