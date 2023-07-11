SUMMARY = "Introspection bindings for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output. \
 \
This package provides the GObject Introspection bindings for the \
libgegl library."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.46"

RPM_NAME = "typelib-1_0-Gegl-0_4-0.4.46-1.1.aarch64.rpm"
RPM_HASH = "d9d9a6ef63637fa865e291a79d9a39895eb4441b0a575de47610739659b18e5b74c90cbde01f0041ef0b44a3145da172f3d0c9ef3de39440ed3e9fe1d47c2c82"

RPROVIDES:${PN} += "typelib-1-0-Gegl-0-4 \
typelib-Gegl"

RDEPENDS:${PN} += "libgegl-0.4.so.0 \
typelib-Babl \
typelib-GLib \
typelib-GObject"

inherit rpm
