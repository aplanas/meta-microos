SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python39-libphdi-20221025-4.1.aarch64.rpm"
RPM_HASH = "9c2dac60710a8aed501070e75ba5493bdf37b089f9e7d69e644c01213c3e08a4203957b43a1c51f5bad1b1ecedb7ea104a88cd7c3460dd836a503f52f68818a5"

RPROVIDES:${PN} += "python39-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
