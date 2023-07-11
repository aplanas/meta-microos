SUMMARY = "Introspection bindings for the Clutter library"
DESCRIPTION = "Clutter is a library for creating fast, visually rich and animated \
graphical user interfaces. It uses OpenGL (or GLES) for rendering. \
 \
This package provides the GObject Introspection bindings for Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "typelib-1_0-Clutter-1_0-1.26.4-4.11.aarch64.rpm"
RPM_HASH = "4a38da06b460a785ee07408cb720d8734a0557861e493d4b21310abf73de6cc9e21236bf30c8657b7927728ce9fed7eb832dfbc00cb578c2dd44fadac0f5f216"

RPROVIDES:${PN} += "typelib-1-0-Clutter-1-0 \
typelib-Cally \
typelib-Clutter \
typelib-ClutterGdk \
typelib-ClutterX11"

RDEPENDS:${PN} += "libclutter-1.0.so.0 \
typelib-Atk \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
