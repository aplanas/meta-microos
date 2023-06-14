SUMMARY = "Introspection bindings for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-Cogl-1_0-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "cec64d673770a675872d1a41a789809dc2689330af542f46556ef8cb74c60328807d0f0e12bf2c500e3d0d1c81f4aab95fb005c8c2ae37537489b1f20383116a"

RPROVIDES:${PN} += "typelib-1-0-Cogl-1-0 \
typelib-Cogl"

RDEPENDS:${PN} += "libcogl.so.20 \
typelib-GL \
typelib-GLib \
typelib-GObject"

inherit rpm
