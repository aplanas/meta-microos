SUMMARY = "GTK Integration Introspection bindings for colord-gtk"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolord-gtk library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "typelib-1_0-ColordGtk-1_0-0.3.0-2.1.aarch64.rpm"
RPM_HASH = "5eddf6989b0f1a3354e82f38179a6ec884509e98412697885453acc9bf6377e62f3d326b2fdfce92a893455f5c8e46657f3e421e9f98ad961d01f4faded2f1ff"

RPROVIDES:${PN} += "typelib-1-0-ColordGtk-1-0 \
typelib-ColordGtk"

RDEPENDS:${PN} += "libcolord-gtk.so.1 \
typelib-Atk \
typelib-Colord \
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
