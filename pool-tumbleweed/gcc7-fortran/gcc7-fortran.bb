SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-fortran-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "c2b634e3e67eaeed887ae4382a7786ab22ddd1f2006a2c65b3acfd004caee7e8e8d77cb213ba8e9f1badfb833b0b9fd22d549db4ac5622ba0c60d1089f020520"

RPROVIDES:${PN} += "gcc7-fortran"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgfortran4 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
