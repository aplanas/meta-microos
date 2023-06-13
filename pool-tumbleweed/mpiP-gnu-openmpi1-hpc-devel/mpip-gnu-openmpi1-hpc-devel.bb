SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi1-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi1-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi1-hpc-devel-3.5-3.3.noarch.rpm"
RPM_HASH = "cfa0aab35e9fa7d59efae1e418aeee2c1498ad6fc7d71827422b74e4ad85ebd7a667e8c72843085efd0e87ee22ebccad499494e1601cbacb129328580e756e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "mpiP_3_5-gnu-openmpi1-hpc-devel"

inherit rpm
