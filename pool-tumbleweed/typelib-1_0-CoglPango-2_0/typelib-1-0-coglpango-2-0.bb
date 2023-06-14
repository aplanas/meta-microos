SUMMARY = "Pango Integration, Introspection bindings for cogl"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for the Pango \
integration in Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-CoglPango-2_0-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "fd822717d41b47d0b6fdaea4e9c4256814751539c16d28cceceb5755717a2772336a2d69f70c530c6937e73c990d77c6289191cf6ba484f575ff1e9ef6452a39"

RPROVIDES:${PN} += "typelib-1-0-CoglPango-2-0 \
typelib-CoglPango"

RDEPENDS:${PN} += "libcogl-pango.so.20 \
libcogl.so.20 \
typelib-Cogl \
typelib-GL \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
