SUMMARY = "Introspection bindings for libcheese"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package provides the GObject Introspection bindings for the \
libcheese library."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "typelib-1_0-Cheese-3_0-44.1-1.1.aarch64.rpm"
RPM_HASH = "fa36f2f5d081c3b1e299ce2cffce73c7d26292721315ebed92d844ce264bd8f13ab4cf663ece10d17ff9504ac6cdf9d8082b27c7eef25865f10f2fd0619eb5a3"

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
