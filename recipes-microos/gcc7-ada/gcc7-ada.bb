SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-ada-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "9816718f9f20a0b89cbf615709008324da04ae7d9ce0c4e7bda37ed92ce32301760729c84c5174e2081d48bbfa086f5472149a66fdd3d1bc695edc21f9d417fc"

RPROVIDES:${PN} += "gcc7-ada gcc7-ada(aarch-64)"
RDEPENDS:${PN} += "gcc7 libada7 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit)"

inherit rpm
