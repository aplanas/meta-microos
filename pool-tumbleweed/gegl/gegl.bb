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
gegl(aarch-64) \
gegl-0_3-orig-addon \
gegl-unstable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbabl-0.1.so.0()(64bit) \
libbabl-0.1.so.0(V0_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgegl-0.4.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libspiro.so.1()(64bit)"

inherit rpm
