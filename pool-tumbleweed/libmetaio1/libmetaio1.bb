SUMMARY = "Shared library for libmetaio - LIGO Light-Weight XML library"
DESCRIPTION = "This package contains the shared libraries needed for running libmetaio \
applications."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "libmetaio1-8.5.1-1.9.aarch64.rpm"
RPM_HASH = "a79c73b8dc3e86ad1606b582bf0570959996b6f5b14b2021a93dd21fe08bd7794ddde296b6207b94765b63178be94d14960ddce625b2a97038ae680e3e996adf"

RPROVIDES:${PN} += "libmetaio.so.1 \
libmetaio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
