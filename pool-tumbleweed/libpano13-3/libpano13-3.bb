SUMMARY = "Panorama Tools Back-End Library"
DESCRIPTION = "Library and utilities for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.21"

RPM_NAME = "libpano13-3-2.9.21-1.8.aarch64.rpm"
RPM_HASH = "32169e50fd18a79a5be2fb98eca7cd93122e4e69a9147de63f7298e8a6659cc77aa17ebedc88ce9458e958fe17c5b9c1c43120067ed244baab2fb314959af1f4"

RPROVIDES:${PN} += "libpano13-3 \
libpano13.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
