SUMMARY = "Pango Integration, Introspection bindings for cogl"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for the Pango \
integration in Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-CoglPango-2_0-1.22.8-2.12.aarch64.rpm"
RPM_HASH = "204c744b7e0a7048cdfc4b7e2109142af5d69f3262bae4c5cd7945bdbc5233256aa4cf5e547042fe4a1c19ed528e96b0a4432820a7b0de36d3f72b1c66fa5663"

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
