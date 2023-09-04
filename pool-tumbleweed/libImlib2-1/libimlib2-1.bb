SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "libImlib2-1-1.12.0-1.1.aarch64.rpm"
RPM_HASH = "8cdc6dc08b3bc559f3615ef09e08f12d4e9c61148dff8bc64cfb1a854c6ac485894b6ba87a3c68fb9a2a35ee6fa78d9d6da27028cbec121478298a7831ede484"

RPROVIDES:${PN} += "libImlib2-1 \
libImlib2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libfreetype.so.6 \
libm.so.6 \
libxcb-shm.so.0 \
libxcb.so.1"

inherit rpm
