SUMMARY = "Pango Integration, Introspection bindings for cogl"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for the Pango \
integration in Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-CoglPango-1_0-1.22.8-2.12.aarch64.rpm"
RPM_HASH = "1f9577498f8a52f5d7d112cefda9a9df927c5a15ca0906d640d22271cfe3c549333d3b3f2ad82ff9b3219f3ddf2c454897d1231194170af4e7ad5d3b3e34c4bd"

RPROVIDES:${PN} += "typelib-1-0-CoglPango-1-0 \
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
