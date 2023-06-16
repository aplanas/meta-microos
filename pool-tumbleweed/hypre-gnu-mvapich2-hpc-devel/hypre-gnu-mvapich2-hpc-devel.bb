SUMMARY = "Dependency package for hypre_2_20_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-mvapich2-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mvapich2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-mvapich2-hpc-devel-2.20.0-1.22.noarch.rpm"
RPM_HASH = "34ec2270a5accea841e7a770edfa1c5c6c51608afdb0a3587edb69b988e96061aa0a98d2eb992acfd36cba3fbfb23b3c7230c8fc1424ae9a1d3c4013277a0211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-mvapich2-hpc-devel"

inherit rpm
