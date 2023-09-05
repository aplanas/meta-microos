SUMMARY = "Dependency package for hypre_2_20_0-gnu-mpich-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-mpich-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mpich-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-mpich-hpc-devel-2.20.0-1.25.noarch.rpm"
RPM_HASH = "b7a29cb053627f6aa3f7fe91d8aeaee0a8fa97bfc0b47d89380e674c65eca4e0cc8cccc975e6ca28dd763ad586ad47cc3e7fb234671e9f36bb69cb41bb19739f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-mpich-hpc-devel"

inherit rpm
