SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi3-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi3-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi3-hpc-devel-2.20.0-1.22.noarch.rpm"
RPM_HASH = "7aabbc5a03fca7a8f5842774b061a6207fb92615283511ee70c16e074670ab3001eb3aa6c777b9dc6abd59898fa8d9945a43e466cadba144211fa933e22e7d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-openmpi3-hpc-devel"

inherit rpm
