SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi3-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi3-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi3-hpc-devel-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "399e8f6e82f8899b3ebc2ae9a7014ecc7baead5a6b4a379d06fadc95efa067d12262c8f6761ecc6308fec3ed23c4365415e2275fb9b73836e612bff9721c030f"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi3-hpc-devel"

inherit rpm
