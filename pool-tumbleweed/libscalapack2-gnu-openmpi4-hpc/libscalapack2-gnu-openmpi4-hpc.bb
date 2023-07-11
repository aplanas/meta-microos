SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi4-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi4-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi4-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi4-hpc-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "1be8568e5847866633de05eace853c63a418af5a2ebcf6b78d614dd3637f8c9cd3a5980c7ceb75ad4eb70558bb261f63edd2229d67b8702791b02dc97ddb8838"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libscalapack2-2-1-0-gnu-openmpi4-hpc"

inherit rpm
