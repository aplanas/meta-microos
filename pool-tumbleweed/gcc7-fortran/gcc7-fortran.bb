SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-fortran-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "c2b634e3e67eaeed887ae4382a7786ab22ddd1f2006a2c65b3acfd004caee7e8e8d77cb213ba8e9f1badfb833b0b9fd22d549db4ac5622ba0c60d1089f020520"

RPROVIDES:${PN} += "gcc7-fortran \
gcc7-fortran(aarch-64)"
RDEPENDS:${PN} += "gcc7 \
libc.so.6(GLIBC_2.34)(64bit) \
libgfortran4 \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
