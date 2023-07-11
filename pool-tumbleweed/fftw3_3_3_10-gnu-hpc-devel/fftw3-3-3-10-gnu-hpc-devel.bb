SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-hpc-devel-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "5e5ad6c4f840fee809ab1438f0417f271a0e4dd6f2d4fb72630761a5635535ec4305ce5be75b74e69d45ac67dda638277150c49a1a017aadd7cbb6aa2d754322"

RPROVIDES:${PN} += "fftw-devel \
fftw3-3-3-10-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3-3-10-gnu-hpc \
libgomp.so.1 \
libm.so.6"

inherit rpm
