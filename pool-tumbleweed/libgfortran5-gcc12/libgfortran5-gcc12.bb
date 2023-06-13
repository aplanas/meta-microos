SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libgfortran5-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "79dbcf424afd34144dc35641e36bf422ccce9b0bcba37738ab5966e1a294c5c4798ebd26d5d58b3a784e4b7fc5875b5d6ebac4608244fb919d0e474502b29089"

RPROVIDES:${PN} += "libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_10.2)(64bit) \
libgfortran.so.5(GFORTRAN_12)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgfortran.so.5(GFORTRAN_9)(64bit) \
libgfortran.so.5(GFORTRAN_9.2)(64bit) \
libgfortran.so.5(GFORTRAN_C99_8)(64bit) \
libgfortran.so.5(GFORTRAN_F2C_8)(64bit) \
libgfortran5 \
libgfortran5-gcc12 \
libgfortran5-gcc12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.18)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
