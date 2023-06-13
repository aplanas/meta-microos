SUMMARY = "NetBSD compatibility library"
DESCRIPTION = "This package holds the shared library of libnbcompat."
LICENSE = "BSD-4-Clause"

PV = "1.0.1"

RPM_NAME = "libnbcompat0-1.0.1-2.8.aarch64.rpm"
RPM_HASH = "d2661bef7f335ef5e583e3f8d9d1819f44f1b4ee7a09f717dcae81f28b56aa9a7b02e66d9d6569753614b1514bc49f455f95c3d4c746fece33131ec6ba338923"

RPROVIDES:${PN} += "libnbcompat.so.0()(64bit) \
libnbcompat0 \
libnbcompat0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
