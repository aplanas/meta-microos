SUMMARY = "Dependency package for mpiP_3_5-gnu-mvapich2-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mvapich2-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-mvapich2-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mvapich2-hpc-doc-3.5-3.4.noarch.rpm"
RPM_HASH = "50d60a4127b38959ef2066e89546a7ff3551663c7a833d5835e5119c2a4ec93f7697c6008f360aab6a482dd96b690272a436ac25984b5d76f93b0c6033fa0766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += "mpiP-3-5-gnu-mvapich2-hpc-doc"

inherit rpm
