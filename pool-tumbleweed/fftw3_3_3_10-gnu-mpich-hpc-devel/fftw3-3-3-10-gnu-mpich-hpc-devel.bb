SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mpich-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "c0a8754d427750100ebb661212eae7540169c8af3b438a049b6ccfae780d6fbb66894a8e956c14153ac34437c10b6fa3045f562bf90e694f5384be38d0783d6c"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-mpich-hpc \
libgomp.so.1 \
libm.so.6 \
mpich-gnu-hpc-devel"

inherit rpm
