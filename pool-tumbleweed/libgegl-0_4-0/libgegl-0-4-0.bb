SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.46"

RPM_NAME = "libgegl-0_4-0-0.4.46-1.1.aarch64.rpm"
RPM_HASH = "32db2569576e19550ba8e080297ac01334483faf65a79b3a6d97e54df8660269d72e6848cdd3645928481ca3e89c2d2d864df048af3f3e26c80232db05aa4f0c"

RPROVIDES:${PN} += "libgegl-0-4-0 \
libgegl-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gegl-0-4 \
ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
