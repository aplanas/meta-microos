SUMMARY = "Library for linear arithmetic over GF(2)"
DESCRIPTION = "M4RI is a library for arithmetic with dense matrices over the \
Galois Field GF(2)."
LICENSE = "GPL-2.0-or-later"

PV = "20200125"

RPM_NAME = "libm4ri-0_0_20200125-20200125-1.3.aarch64.rpm"
RPM_HASH = "3d5ae83acac9a39672329a934d99ad4af9af08910d04d73fd316f8a364b58d402ee51bc0fb1b75a99a9b6cc18a97a4168ee59231944e68a60e4794ea6bb32aa4"

RPROVIDES:${PN} += "libm4ri-0.0.20200125.so()(64bit) \
libm4ri-0_0_20200125 \
libm4ri-0_0_20200125(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
