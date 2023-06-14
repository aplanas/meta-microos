SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.44"

RPM_NAME = "gegl-0.4.44-1.2.aarch64.rpm"
RPM_HASH = "2e6c4de02054eae21b372b46f5616060be46f4f60b1492e8c9359759d347065090ea46724f5c5d2af031a6924398e4fed9e755ebdcf29159eb5e4582a63855cd"

RPROVIDES:${PN} += "gegl \
gegl-0-3-orig-addon \
gegl-unstable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgegl-0.4.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libspiro.so.1"

inherit rpm
