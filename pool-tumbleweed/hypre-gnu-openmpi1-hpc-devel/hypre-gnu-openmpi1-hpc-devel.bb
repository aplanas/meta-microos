SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi1-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi1-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi1-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi1-hpc-devel-2.20.0-1.24.noarch.rpm"
RPM_HASH = "9cf329d6bd2c02c8a8ff8560da8dac3a57b56f3a9237187962feb405454cd4c0d79119d12d86c3eaa7fc809f8370cb57a6e3a8ec095a93e055d9e96152b3d266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-openmpi1-hpc-devel"

inherit rpm
