SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mpich-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "c0a8754d427750100ebb661212eae7540169c8af3b438a049b6ccfae780d6fbb66894a8e956c14153ac34437c10b6fa3045f562bf90e694f5384be38d0783d6c"

RPROVIDES:${PN} += "fftw-devel \
fftw3_3_3_10-gnu-mpich-hpc-devel \
fftw3_3_3_10-gnu-mpich-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3_3_3_10-gnu-mpich-hpc \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
mpich-gnu-hpc-devel"

inherit rpm
