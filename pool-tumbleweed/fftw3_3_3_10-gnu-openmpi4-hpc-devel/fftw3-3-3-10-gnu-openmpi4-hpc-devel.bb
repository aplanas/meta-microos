SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi4-hpc-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "354a0d6b9475bea9ff0daac497516ef9844186a6862fc2ed857e3d420ee7393d52a365f9c5de9e99928e41d5763570344003203d9f8540526294b0997fa3046f"

RPROVIDES:${PN} += "fftw-devel \
fftw3_3_3_10-gnu-openmpi4-hpc-devel \
fftw3_3_3_10-gnu-openmpi4-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3_3_3_10-gnu-openmpi4-hpc \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
openmpi4-gnu-hpc-devel"

inherit rpm