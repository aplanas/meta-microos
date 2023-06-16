SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-openmpi2-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-openmpi2-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi2-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-openmpi2-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "655bf7c14e6193d7241e8d09b4aa4866852882cdceb83153e45a91a440e72937606b4382be1631e8c935d21f0725abb6cf0024c3f34af8ab41e7dfa36f8a2959"

RPROVIDES:${PN} += "libpetsc-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpetsc-3-18-5-gnu-openmpi2-hpc"

inherit rpm
