SUMMARY = "MinGW Windows cross-compiler for Fortran"
DESCRIPTION = "MinGW Windows cross-compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-fortran-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "13f302a55ab2a353f6ff5e3c3f729e9012860513ff87920aec03a7c4a8d1f9451f9a024bb50eb9438b1f2a58f5cf0e05573a45ecafa00427640537a41659d6a7"

RPROVIDES:${PN} += "mingw64-cross-gcc-fortran"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
