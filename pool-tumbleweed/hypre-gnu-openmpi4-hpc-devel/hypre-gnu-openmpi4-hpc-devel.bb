SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi4-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi4-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi4-hpc-devel-2.20.0-1.22.noarch.rpm"
RPM_HASH = "50fc896eb2d7ab172a71db877fc010cab41e161bfbef48900044c6527cd02cd8624b3055d4b8d4e0940a072475a7479bae438656af06aa854fd92f7c68ca21ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
hypre_2_20_0-gnu-openmpi4-hpc-devel"

inherit rpm
