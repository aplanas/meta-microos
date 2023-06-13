SUMMARY = "Devel package for HPC GNU compiler environment"
DESCRIPTION = "Provides package dependencies for building with the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-devel-1.4-10.2.noarch.rpm"
RPM_HASH = "204b1fdbaeebf68fd23779fc91e748968ecc29d667bf06f89a046f67ef3aa812b2cb3f237588b137135cd3ea1bffa647adbd99d1db6a7d355ca2869e49fbefff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-compilers-hpc-devel \
gnu13-compilers-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
gcc \
gcc-c++ \
gcc-fortran \
gcc13 \
gcc13-c++ \
gcc13-fortran \
gnu-compilers-hpc"

inherit rpm
