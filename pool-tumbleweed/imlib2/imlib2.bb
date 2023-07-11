SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-1.11.1-2.1.aarch64.rpm"
RPM_HASH = "3213827757550d99c6a42d17612809951de90ed8da8826698d184033b1661b2488df51fdc413eb753884141798e29c3a8b5a4ac67b6396fa2070d500cc0d1270"

RPROVIDES:${PN} += "imlib2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
