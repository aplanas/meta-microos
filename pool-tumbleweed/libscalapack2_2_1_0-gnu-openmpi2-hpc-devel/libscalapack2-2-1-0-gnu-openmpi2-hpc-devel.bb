SUMMARY = "Development libraries for ScaLAPACK (openmpi2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi2-hpc-devel-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "ee1bc68fe7fb91e115034cd751a23bb5f7d3cc7adc693285c6bd639be0b14fc6350bb3f051ace35f90bb784eaf3b13c1418b1bdb017e8d16f780205287ef8a48"

RPROVIDES:${PN} += "libblacs2_2_1_0-gnu-openmpi2-hpc-devel \
libscalapack2_2_1_0-gnu-openmpi2-hpc-devel \
libscalapack2_2_1_0-gnu-openmpi2-hpc-devel(aarch-64) \
scalapack_2_1_0-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
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
libopenblas-gnu-hpc-devel \
libscalapack2_2_1_0-gnu-openmpi2-hpc \
openmpi2-gnu-hpc-devel"

inherit rpm
