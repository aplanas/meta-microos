SUMMARY = "Devel package for HPC GNU compiler environment"
DESCRIPTION = "Provides package dependencies for building with the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-devel-1.4-14.1.noarch.rpm"
RPM_HASH = "4a57e9b8a7a71a076984994a277010e0f8e6e05b52540764cff9ad16f2a8701aa09ef8642d2dc8ed4922ad88c484fcb3d50967f0655d10486757a9f6dcb57189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-compilers-hpc-devel \
gnu13-compilers-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
gcc-c++ \
gcc-fortran \
gcc13 \
gcc13-c++ \
gcc13-fortran \
gnu-compilers-hpc"

inherit rpm
