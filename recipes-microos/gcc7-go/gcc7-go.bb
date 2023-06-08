SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-go-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "ba74989d5aedf7f0cd0801d90f5ee8cf66d79a70354c2d35061af6ab180b0f32b9aecbff012070ddccc8f3ad6800245a3a0c6193677a05896aafb9bff4bcf464"

RPROVIDES:${PN} += "gcc7-go gcc7-go(aarch-64)"
RDEPENDS:${PN} += "gcc7 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libgo.so.11()(64bit) libgo11 libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit)"

inherit rpm
