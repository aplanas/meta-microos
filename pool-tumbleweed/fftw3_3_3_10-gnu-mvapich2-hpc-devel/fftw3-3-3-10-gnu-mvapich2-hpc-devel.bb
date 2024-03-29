SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mvapich2-hpc-devel-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "3f7f89087b6b82c0ba6d5380692eb117c3936b708c1677963ab9429b6f75e2e20aaf3d9d0564e5ab053fc0838476e5473477f18ca78da85febeae8ef7692232e"

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
