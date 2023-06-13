SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgfortran4-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "3d51ac350ad92a5749c6bc5580f93011d4ad9b79436c03a246f4a1e588924e91d53c56269ff5b6549646b2da3ce04fa0a4c93d36c1f5876bcfdc33b3cbbf154f"

RPROVIDES:${PN} += "libgfortran.so.4()(64bit) \
libgfortran.so.4(GFORTRAN_7)(64bit) \
libgfortran.so.4(GFORTRAN_C99_7)(64bit) \
libgfortran.so.4(GFORTRAN_F2C_7)(64bit) \
libgfortran4 \
libgfortran4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
