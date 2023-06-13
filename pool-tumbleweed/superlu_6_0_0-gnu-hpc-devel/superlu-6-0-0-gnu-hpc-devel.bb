SUMMARY = "Headers and development library for libsuperlu_6_0_0-gnu-hpc"
DESCRIPTION = "SuperLU headers and libraries files needed for development 1"
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu_6_0_0-gnu-hpc-devel-6.0.0-2.1.aarch64.rpm"
RPM_HASH = "279868eb38802c49b2d10a7da8f51f2ee865dfee65bef49fa3e00a67b1bd46558910a56f9464adae82511728c547a6a1a705ee356e65cf814700b20606b10dcd"

RPROVIDES:${PN} += "superlu_6_0_0-gnu-hpc-devel \
superlu_6_0_0-gnu-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenblas-gnu-hpc-devel \
libsuperlu_6_0_0-gnu-hpc"

inherit rpm
