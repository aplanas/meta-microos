SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "4bcae33db7fde618a4f53c48f4fd4ce7cef4abc199f57e9d1e2f6d16e698ead29b996064d2264ea377b15df1cbed3c8d1fefba1935854eb475ec8f2dd518d70f"

RPROVIDES:${PN} += "fftw-devel \
fftw3_3_3_10-gnu-hpc-devel \
fftw3_3_3_10-gnu-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3_3_3_10-gnu-hpc \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
