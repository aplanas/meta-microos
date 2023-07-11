SUMMARY = "SDL plugin for xine"
DESCRIPTION = "SDL xine video output plugin \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-sdl-1.2.13-2.3.aarch64.rpm"
RPM_HASH = "2db4f0335ee5d8d3ec48978eef17e8c55d5d2278e523d81fb3d57d483d6a80b99e7f0c3416f2d4f1a69491465c7cfcfeee8576033ee4ad7c730b2506d1906843"

RPROVIDES:${PN} += "libxine2-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libX11.so.6 \
libc.so.6 \
libxine.so.2 \
libxine2"

inherit rpm
