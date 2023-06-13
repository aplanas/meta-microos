SUMMARY = "Utilities for packaging support"
DESCRIPTION = "Utilities (like strip and objdump) which are needed for generating package"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-cross-binutils-utils-2.39-4.3.aarch64.rpm"
RPM_HASH = "0460a35872c2fd73becc6aa93023c0f52e22dae48b3169b3c5a453bf9b5bda0d72db299b8e1d1ac1faa2c8470f22e18f764b2d8bb5d909711044a1e2ae2dbf3d"

RPROVIDES:${PN} += "mingw32-cross-binutils-utils \
mingw32-cross-binutils-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
