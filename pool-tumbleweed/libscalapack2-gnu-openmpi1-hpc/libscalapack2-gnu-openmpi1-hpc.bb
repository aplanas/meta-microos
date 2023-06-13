SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi1-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi1-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi1-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi1-hpc-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "69b3d8afcc323408ebc45ed23f1497b5aee14804094446cd442a1a9c67c248d90aad7b2fdcdd9f1c66c4e784db1331aa1dd6d231c7b9785a9b8bf283e6820188"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi1-hpc \
libscalapack2-gnu-openmpi1-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libscalapack2_2_1_0-gnu-openmpi1-hpc"

inherit rpm
