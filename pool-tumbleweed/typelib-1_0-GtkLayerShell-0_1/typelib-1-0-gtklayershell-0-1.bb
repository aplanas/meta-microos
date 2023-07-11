SUMMARY = "Library to create desktop components for Wayland"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone.. \
 \
This package provides the GObject Introspection bindings for gtk-layer-shell."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.8.1"

RPM_NAME = "typelib-1_0-GtkLayerShell-0_1-0.8.1-1.2.aarch64.rpm"
RPM_HASH = "0f0edf936f075ccbec4ead75dc2c3270edc0ab56e82e865394ee2c61d2c07d73875ae78143c547ed37bd640cc1de7e0afa9819cfca34fd333216c882e62fe798"

RPROVIDES:${PN} += "typelib-1-0-GtkLayerShell-0-1 \
typelib-GtkLayerShell"

RDEPENDS:${PN} += "libgtk-layer-shell.so.0 \
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
