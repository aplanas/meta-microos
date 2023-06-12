SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi2-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi2-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi2-hpc-devel-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "1080a94ac115ceb3b4274b2838bb3ff15d63395c4496b430235a6fc346d7763cadc0717d101e4a5119a6e2adc4ffded7ad0b6bb737ba84bc73a0c474090b8594"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi2-hpc-devel \
libscalapack2-gnu-openmpi2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-openmpi2-hpc-devel"

inherit rpm
