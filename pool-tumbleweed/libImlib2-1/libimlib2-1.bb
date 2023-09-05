SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "libImlib2-1-1.12.0-2.1.aarch64.rpm"
RPM_HASH = "12c8c81cd9d754f7d9c95342b6ec5a0af40fd821dea12dd54d72ffd812ae2f6142630934d5acc089d85446adbe57f280afeec53feb87490c5d5fa47d17a0bb47"

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
