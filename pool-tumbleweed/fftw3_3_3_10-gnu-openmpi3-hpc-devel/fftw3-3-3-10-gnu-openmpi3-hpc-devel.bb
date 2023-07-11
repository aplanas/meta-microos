SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi3-hpc-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "d5c00768407e121f2534fbb1e4f10e31503499abc184de5c7d3e0878e1ecbd5c61489d633a2bfc51e00d92ca4c4a9d966eb00ff0821e2e01bcfaed666e1980fd"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-openmpi3-hpc \
libgomp.so.1 \
libm.so.6 \
openmpi3-gnu-hpc-devel"

inherit rpm
