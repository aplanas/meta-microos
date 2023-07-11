SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi1-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi1-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi1-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi1-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "17410e569309e6d545b73e2e314978b3ad6316736ba65c3d6f377e885dc5f91201805fb7db9d351378dfa17c84b8904fdad609c89f1b6bfdeafa5a0d804c95ea"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi1-hpc-devel"

inherit rpm
