SUMMARY = "Introspection bindings for libcheese"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package provides the GObject Introspection bindings for the \
libcheese library."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "typelib-1_0-Cheese-3_0-44.0.1-1.1.aarch64.rpm"
RPM_HASH = "0ac2c0055d0e79833a61a3767fe403e5113e6a0aa909f5314f19b69729e2ac43c35a7420bb1e9de8cf7cf905d1a78d3306145a3d18615a4c39d532e1e8454a35"

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
