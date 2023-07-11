SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi2-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "7d41a709865492c18dfde708a635f2265402fb61a2f2e5dfd000e8c361ae9db1ae9645916557a7e96a8c533f59767577ffed9561dd3417ebef18c011ffaaebea"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-openmpi2-hpc \
libgomp.so.1 \
libm.so.6 \
openmpi2-gnu-hpc-devel"

inherit rpm
