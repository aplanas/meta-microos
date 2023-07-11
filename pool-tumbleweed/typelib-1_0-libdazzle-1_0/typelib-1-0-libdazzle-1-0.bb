SUMMARY = "Collection of fancy features for GLib and Gtk+ -- Introspection bindings"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone.. \
 \
This package provides the GObject Introspection bindings for libdazzle."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "typelib-1_0-libdazzle-1_0-3.44.0-1.8.aarch64.rpm"
RPM_HASH = "2ca8a13039c24a49a6cd69976b578e03e408a3974ea70457039b35f0d0299173e40ca186a0505c8fce04c736a840f5a0f10b637ccdf39258c5a2f239a7f06ba5"

RPROVIDES:${PN} += "typelib-1-0-libdazzle-1-0 \
typelib-Dazzle"

RDEPENDS:${PN} += "libdazzle-1.0.so.0 \
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
