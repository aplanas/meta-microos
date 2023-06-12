SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-ada-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "d600b0736fb4869bc7c19b0522163fdf8e90e28005bb97325fdc3c65308074609c6c88dea451c5850054fdc342551e05cfdf1c773c1a4ab2903185a262f8bf19"

RPROVIDES:${PN} += "gcc7-ada \
gcc7-ada(aarch-64)"
RDEPENDS:${PN} += "gcc7 \
libada7 \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
