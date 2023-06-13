SUMMARY = "Introspection bindings for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output. \
 \
This package provides the GObject Introspection bindings for the \
libgegl library."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.44"

RPM_NAME = "typelib-1_0-Gegl-0_4-0.4.44-1.2.aarch64.rpm"
RPM_HASH = "e0ebf687e355761f870aff16feb1a3ce33589f21cfa241332186ff73ed46e763dcf20fe7b97402ef3b3b565100458e5e7e155c1a1faf91114f4802f88f985810"

RPROVIDES:${PN} += "typelib(Gegl) \
typelib-1_0-Gegl-0_4 \
typelib-1_0-Gegl-0_4(aarch-64)"

RDEPENDS:${PN} += "libgegl-0.4.so.0()(64bit) \
typelib(Babl) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
