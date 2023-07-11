SUMMARY = "Devel package for HPC GNU compiler environment"
DESCRIPTION = "Provides package dependencies for building with the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-devel-1.4-13.1.noarch.rpm"
RPM_HASH = "fc70aee1e8a6f53877e3b36ddcbafdaf926ac2842fcde141bd95126bfa6f8f52b112d3c961b254bc296cc2e2c733b9a0186b731dda36376e9274364fe8f6219f"
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
