SUMMARY = "Introspection bindings for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-Cogl-2_0-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "2fb5a8d812bf8b348bd0bc18f53cd271a68ccdbb00a462a50fb9b877e06eca0ccfab746d9a8f113b30b5024ad516432a5b8ed93784758a4af74ca7815dd9d248"

RPROVIDES:${PN} += "typelib(Cogl) \
typelib-1_0-Cogl-2_0 \
typelib-1_0-Cogl-2_0(aarch-64)"

RDEPENDS:${PN} += "libcogl.so.20()(64bit) \
typelib(GL) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
