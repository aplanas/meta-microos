SUMMARY = "Introspection bindings for Pluma, a UTF-8 text editor"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-Pluma-1_0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "993ec50316ec736f0ad5d552a01f98db50ba844954ac1fd52365353e3479e476736af73d5064a5648821dd7749db68fb74fffa5ba259c36a85439fc8414bd519"

RPROVIDES:${PN} += "typelib(Pluma) \
typelib-1_0-Pluma-1_0 \
typelib-1_0-Pluma-1_0(aarch-64)"

RDEPENDS:${PN} += "pluma \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(GtkSource) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
