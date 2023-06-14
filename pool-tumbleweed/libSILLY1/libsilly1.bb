SUMMARY = "Simple Image Loading LibrarY"
DESCRIPTION = "SILLY means Simple Image Loading LibrarY. The aim of this library is to provide \
a simple library for loading image in the context of CEGUI. The library supports \
only the most common image format. The project was initially launch in order \
to provide an MIT based replacement of DevIL with less image format supported \
and focused on loading image only."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libSILLY1-0.1.0-1.8.aarch64.rpm"
RPM_HASH = "314e724ae7fb9a578604916c6fd882edcd0e6d86caa525ff5dd3caa44d059d8280cd9a35c304790eef5ea984c51ea04ae6e517a36f968f937592a7b56606168e"

RPROVIDES:${PN} += "libSILLY.so.1 \
libSILLY1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
