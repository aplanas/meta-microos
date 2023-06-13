SUMMARY = "Shared library for libmetaio - LIGO Light-Weight XML library"
DESCRIPTION = "This package contains the shared libraries needed for running libmetaio \
applications."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "libmetaio1-8.5.1-1.8.aarch64.rpm"
RPM_HASH = "e7560f880c7f1f9b0a2c4f45e0f8b7e8306f626efcb520cc5503b43e4fffa4ca5a345e9916929f26c71b9656b672d0731172758350433abc12cec1a6b1d61838"

RPROVIDES:${PN} += "libmetaio.so.1()(64bit) \
libmetaio1 \
libmetaio1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0.2)(64bit)"

inherit rpm
