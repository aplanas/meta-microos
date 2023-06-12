SUMMARY = "Library for the Portable Network Graphics Format (PNG)"
DESCRIPTION = "libpng is the official reference library for the Portable Network \
Graphics format (PNG)."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-0-1.2.59-2.6.aarch64.rpm"
RPM_HASH = "02ab22c3b3fa72e3a53a90d8fe49deb7b8a6af3a6ebc3d57aa50079953e40bf6cc253ac660255931a1ab830c140b6508af25b5fc40d34fcbfe00cb29d0268dc0"

RPROVIDES:${PN} += "libpng \
libpng12-0 \
libpng12-0(aarch-64) \
libpng12.so.0()(64bit) \
libpng12.so.0(PNG12_0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm