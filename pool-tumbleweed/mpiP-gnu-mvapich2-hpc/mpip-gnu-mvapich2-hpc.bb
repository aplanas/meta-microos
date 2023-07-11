SUMMARY = "Dependency package for mpiP_3_5-gnu-mvapich2-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mvapich2-hpc provides the dependency to get binary package mpiP_3_5-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mvapich2-hpc-3.5-3.4.noarch.rpm"
RPM_HASH = "e19551e41984ed460a8c9bcff14d76f5c0cc90501c2b9651cadbaa1798c826f86c4016e23af222d1a53895aee37786d84b35ccf0447b2a79c7051d8083970a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpiP-3-5-gnu-mvapich2-hpc"

inherit rpm
