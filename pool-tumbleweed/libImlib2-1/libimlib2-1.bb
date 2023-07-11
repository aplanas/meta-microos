SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libImlib2-1-1.11.1-2.1.aarch64.rpm"
RPM_HASH = "da7623bb2c5cccbe1e12f594ee12aec9a4528142b7c9805eb9a76d1e4ca6a2e95230ce7476028e163f78b5e33f237ac35a0cde51ed9c646d2f7c62bcec221ffd"

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
