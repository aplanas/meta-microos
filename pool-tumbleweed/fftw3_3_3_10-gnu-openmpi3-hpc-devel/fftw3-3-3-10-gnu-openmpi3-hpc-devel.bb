SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi3-hpc-devel-3.3.10-3.4.aarch64.rpm"
RPM_HASH = "653f01cc37183b70de6e15db487eb8d62ce8e0589a72cf33447db4689dd2a9f41be4872d5891fe919631a15e04bd437b63ceeb247c4117ae2410ee1629b7919e"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-openmpi3-hpc \
libgomp.so.1 \
libm.so.6 \
openmpi3-gnu-hpc-devel"

inherit rpm
