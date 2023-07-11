SUMMARY = "Introspection bindings for libcheese"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package provides the GObject Introspection bindings for the \
libcheese library."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "typelib-1_0-Cheese-3_0-44.0.1-1.2.aarch64.rpm"
RPM_HASH = "6998b9cf29baee03e340401b3d4fd6cf0f3a047615e81322f2f6d7c64a02e37ccc5396cd6100a6ac382e480803c5279655d5d371f756e2cb9f3c3cbda51fcfc5"

RPROVIDES:${PN} += "typelib-1-0-Cheese-3-0 \
typelib-Cheese"

RDEPENDS:${PN} += "libcheese.so.8 \
typelib-Atk \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
