SUMMARY = "Introspection bindings for Pluma, a UTF-8 text editor"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-Pluma-1_0-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "2fe0e9ddce36ed50b6d47e81f241dfd123c12ca7e9326c18cb4d8b386804ff15c56b63633c5ec555642289a97e4e7dc65e868c8db35c2d4465d13065fea5e9dc"

RPROVIDES:${PN} += "typelib-1-0-Pluma-1-0 \
typelib-Pluma"

RDEPENDS:${PN} += "pluma \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
