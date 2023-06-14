SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "4bcae33db7fde618a4f53c48f4fd4ce7cef4abc199f57e9d1e2f6d16e698ead29b996064d2264ea377b15df1cbed3c8d1fefba1935854eb475ec8f2dd518d70f"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-hpc \
libgomp.so.1 \
libm.so.6"

inherit rpm
