SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi4-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "5e142753d180c1b0bbcbce3b33017ee2125526c7fade0cf479f5685f0807a72040cfb9c86c26f84f0ddc1685263d520d041f0cda2e84d21ad0dc1b381368ebcb"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-openmpi4-hpc \
libgomp.so.1 \
libm.so.6 \
openmpi4-gnu-hpc-devel"

inherit rpm
