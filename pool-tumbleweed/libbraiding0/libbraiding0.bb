SUMMARY = "Library for computations on braid groups"
DESCRIPTION = "CBraid is a C++ library for various computations on braid groups, \
such as normal forms."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "libbraiding0-1.2-1.4.aarch64.rpm"
RPM_HASH = "7eee3bda9b7a610404ae77f91f2d3cf78eb63e846c2dd7e0464b46a8113673a5eca73128c51818f49dbcd919a48f458b02a6b791e11776e5fbf9f5ff21a244bc"

RPROVIDES:${PN} += "libbraiding.so.0 \
libbraiding0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
