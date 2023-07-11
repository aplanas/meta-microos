SUMMARY = "Dependency package for hypre_2_20_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-mvapich2-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mvapich2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-mvapich2-hpc-devel-2.20.0-1.23.noarch.rpm"
RPM_HASH = "145317290d0f1b5b8076240e7ce4ab0f18f69d425131930adec03e84614a8dbbbfd17a175c4f145a8f4cbbe2467115d8c3b83644457f990d8121b50a1a4e2728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-mvapich2-hpc-devel"

inherit rpm
