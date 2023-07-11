SUMMARY = "Dependency package for mpiP_3_5-gnu-mpich-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mpich-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-mpich-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mpich-hpc-doc-3.5-3.4.noarch.rpm"
RPM_HASH = "115dd6c89beb24610015f4292e7b57320e6c93ba6278fbed3bfa5d6e04a5b9fc418cb37c4521c87248e959dbe78e4d0042fc1afe16fd9e448d2175f706dd5fb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += "mpiP-3-5-gnu-mpich-hpc-doc"

inherit rpm
