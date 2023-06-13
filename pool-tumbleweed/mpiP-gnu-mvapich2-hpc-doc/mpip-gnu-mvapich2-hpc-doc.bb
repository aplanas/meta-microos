SUMMARY = "Dependency package for mpiP_3_5-gnu-mvapich2-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mvapich2-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-mvapich2-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mvapich2-hpc-doc-3.5-3.3.noarch.rpm"
RPM_HASH = "d15bac43393ee0c58586d39a3e955508f8181d6182f9aa591aaf204f83064ff10ee16edf5c3f475c0d379727aa3f7b2fc2564a95abf1a44c0b8066a59c4b7b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += "mpiP_3_5-gnu-mvapich2-hpc-doc"

inherit rpm
