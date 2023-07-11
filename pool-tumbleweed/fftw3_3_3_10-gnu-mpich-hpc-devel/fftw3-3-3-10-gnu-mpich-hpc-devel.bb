SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mpich-hpc-devel-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "f2e61156e1c87026e4feacd02886a82848d3f8d60f9ceb7004ce91fa24af1aa5b8c6ebcda50f2fe5069eda816ee4496ee49c36278478376a785a88254c665f30"

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
