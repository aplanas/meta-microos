SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi1-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi1-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi1-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi1-hpc-devel-2.20.0-1.23.noarch.rpm"
RPM_HASH = "2fc59e7b657bc7a731e80ac2156c0c5b685c8013800c62f85a747dab36e5737fdb7a86532144148aa95d500cc6e2cb18d6de731065a864f6aebda11518e83b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-openmpi1-hpc-devel"

inherit rpm
