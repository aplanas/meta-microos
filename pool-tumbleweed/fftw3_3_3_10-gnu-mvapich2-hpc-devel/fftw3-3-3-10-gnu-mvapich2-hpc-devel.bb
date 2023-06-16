SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mvapich2-hpc-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "d7b894426893176b76f8822c872810b63f93b857883b593d9c696ed69b804ea329b80e0826fc05403b62db238a30db8c05894390fa1e100392de681866c5b7e3"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-mvapich2-hpc \
libgomp.so.1 \
libm.so.6 \
mvapich2-gnu-hpc-devel"

inherit rpm
