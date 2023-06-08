SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi1-hpc-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "0710fb4589d9acf46f98988006b45ea07666e98809bd2714f75e9437611bed96871fa5ddf3600739f664124ab0997b47b187fb361b69ff1b0ec8fbeb859caf34"

RPROVIDES:${PN} += "fftw-devel fftw3_3_3_10-gnu-openmpi1-hpc-devel fftw3_3_3_10-gnu-openmpi1-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh glibc-devel gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3_3_3_10-gnu-openmpi1-hpc libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) openmpi1-gnu-hpc-devel"

inherit rpm
