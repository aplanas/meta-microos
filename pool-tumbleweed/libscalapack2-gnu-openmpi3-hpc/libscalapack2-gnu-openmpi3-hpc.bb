SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi3-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi3-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi3-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi3-hpc-2.1.0-9.18.aarch64.rpm"
RPM_HASH = "eece3e71a5ec40380aad2aa3c0b550b0f3779490fbd1971c52e1969eb64eccc9381dfb29acea01e450b9afbe1891ccb605c9e34d9d4fd0fa3187e2bf10ee7032"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi3-hpc \
libscalapack2-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libscalapack2_2_1_0-gnu-openmpi3-hpc"

inherit rpm
