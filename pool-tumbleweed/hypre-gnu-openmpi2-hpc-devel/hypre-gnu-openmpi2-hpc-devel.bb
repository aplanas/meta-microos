SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi2-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi2-hpc-devel-2.20.0-1.23.noarch.rpm"
RPM_HASH = "be88bb3a74f0da0d02ef250c2425b092fb996f88bdcf7afb70fcb08920c2bdc4bd749c6477fdd7e4b504f9c48b21e4ac66c8707f521ffc0738d6c31b06e16528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-openmpi2-hpc-devel"

inherit rpm
