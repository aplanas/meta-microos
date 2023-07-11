SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.46"

RPM_NAME = "gegl-0.4.46-1.1.aarch64.rpm"
RPM_HASH = "3bb7f0a2125a044512caaf85d95bc0767e97af11526dbdb05139d370c0b0d1f5552b6be6d57fd3dfe4a8ff0a1dcdaee54c98f12bc6ad91ca2704775ebd35cc6c"

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
