SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.44"

RPM_NAME = "libgegl-0_4-0-0.4.44-1.2.aarch64.rpm"
RPM_HASH = "17a3c175791d94f8ca265c5fffb1a2b24502f6f43b33c82d59aca912523d59e126b8eab494037a16e4eaca880e80d8dc0dc5906285435d19176b25e7208385bc"

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
