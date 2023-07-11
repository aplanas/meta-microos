SUMMARY = "Introspection bindings for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-Cogl-1_0-1.22.8-2.12.aarch64.rpm"
RPM_HASH = "08b9ee7260e2ff00e4ad7d983d9649b39a41086df9ebda6086650af4ed39d8d1449e2bcb84c827240b06a50ddc9df267f431f44a6308c3f9f2d331c1e1207354"

RPROVIDES:${PN} += "typelib-1-0-Cogl-1-0 \
typelib-Cogl"

RDEPENDS:${PN} += "libcogl.so.20 \
typelib-GL \
typelib-GLib \
typelib-GObject"

inherit rpm
