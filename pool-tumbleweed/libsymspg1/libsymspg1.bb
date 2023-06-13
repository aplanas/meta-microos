SUMMARY = "The shared library for SPGLIB"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "libsymspg1-2.0.2-1.3.aarch64.rpm"
RPM_HASH = "45496e97aa9dca3666053d2820f3a0b1b78fe5b5cf2c7603af032917d4893f81fcda057cf6c000f69dc9d600dd8f163672619a5d2439f2e5c981fd3dff80d4ed"

RPROVIDES:${PN} += "libsymspg.so.1()(64bit) \
libsymspg1 \
libsymspg1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
