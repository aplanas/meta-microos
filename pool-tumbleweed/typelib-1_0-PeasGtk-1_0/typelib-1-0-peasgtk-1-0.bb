SUMMARY = "Introspection bindings for the libpeas-gtk library"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides the GObject Introspection bindings for the \
libpeas-gtk library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "typelib-1_0-PeasGtk-1_0-1.36.0-1.2.aarch64.rpm"
RPM_HASH = "dc901861ff9ccdeb7104336af5d756c3a1e0c7e56a7eb682aaab82a02f785edd45bae7c748c742f9bafbeabe332565f46a12cfe23b621037b4ac49709cbf20f2"

RPROVIDES:${PN} += "typelib-1-0-PeasGtk-1-0 \
typelib-PeasGtk"

RDEPENDS:${PN} += "libpeas-gtk-1.0.so.0 \
typelib-Atk \
typelib-GIRepository \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-Peas \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
