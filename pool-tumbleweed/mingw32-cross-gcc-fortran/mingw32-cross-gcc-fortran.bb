SUMMARY = "MinGW Windows cross-compiler for Fortran"
DESCRIPTION = "MinGW Windows cross-compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-fortran-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "7ae6bc81e9ef0708078f958d7cff3fbace8bde9d1ff4cd455ce65a93692d72610d28e2661511526ddcdb677de7f991cba7d360b6b6f8ff480e8b87897bf2c903"

RPROVIDES:${PN} += "mingw32-cross-gcc-fortran \
mingw32-cross-gcc-fortran(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
