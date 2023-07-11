SUMMARY = "Introspection bindings for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-Cogl-2_0-1.22.8-2.12.aarch64.rpm"
RPM_HASH = "bb62436bc4aadf656e7d79c6d7c9409f9fc2742a0790da9a18910d85ca3c49faaf55fd9ef5daebe232731d0bf2c0439e7989a3e342800b5790c435383ca6dc58"

RPROVIDES:${PN} += "typelib-1-0-Cogl-2-0 \
typelib-Cogl"

RDEPENDS:${PN} += "libcogl.so.20 \
typelib-GL \
typelib-GLib \
typelib-GObject"

inherit rpm
