SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi1-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "4218db8551b0b0fd1a4a5c15ced002ae26516ffdcc7eacbabb73af4da9aecaa4bedf9b9173497058f439d4470e6aee23bc4324c18a6a47d08c91d1663abfca4f"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-openmpi1-hpc \
libgomp.so.1 \
libm.so.6 \
openmpi1-gnu-hpc-devel"

inherit rpm
