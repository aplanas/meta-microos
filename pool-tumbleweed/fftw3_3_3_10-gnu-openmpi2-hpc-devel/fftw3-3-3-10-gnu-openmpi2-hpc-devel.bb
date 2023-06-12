SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi2-hpc-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "ba1457f60497c6efdc550d8b18ce0aaac4bde8d74a7d272916bceaba6c07e097a0a46817384570784e678fbf660aee77a72e195693f80d8e4ff6c4b97e5581c1"

RPROVIDES:${PN} += "fftw-devel \
fftw3_3_3_10-gnu-openmpi2-hpc-devel \
fftw3_3_3_10-gnu-openmpi2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3_3_3_10-gnu-openmpi2-hpc \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
openmpi2-gnu-hpc-devel"

inherit rpm
