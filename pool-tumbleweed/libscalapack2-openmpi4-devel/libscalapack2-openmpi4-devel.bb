SUMMARY = "Development libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi4-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "997f4e1919d869e6b77d3e07689f99852b5ee8e3971c103c92cf5960e10b66e28de878454c8a81fc96b6f98ed901bbd3ddea6427ed57ff256f10ec2577af35ef"

RPROVIDES:${PN} += "libscalapack.so.2.1.0()(64bit) \
libscalapack2-openmpi4-devel \
libscalapack2-openmpi4-devel(aarch-64) \
scalapack-openmpi4-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.40()(64bit) \
libscalapack2-openmpi4 \
openmpi4-devel"

inherit rpm
