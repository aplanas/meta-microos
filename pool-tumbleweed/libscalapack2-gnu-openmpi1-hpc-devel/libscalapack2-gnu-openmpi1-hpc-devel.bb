SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi1-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi1-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi1-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi1-hpc-devel-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "71ea424d39668f19acd1dbf9ff21f389b097412ce0893ea59241cab07bd31879f84ead64ba110f14e1ccda4c51de7553fd3fb6ecb3b01f16ab34a17432548b22"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi1-hpc-devel"

inherit rpm
