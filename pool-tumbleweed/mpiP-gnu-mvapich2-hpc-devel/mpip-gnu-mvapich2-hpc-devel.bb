SUMMARY = "Dependency package for mpiP_3_5-gnu-mvapich2-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mvapich2-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mvapich2-hpc-devel-3.5-3.4.noarch.rpm"
RPM_HASH = "c70df53bfad1eb6e141c125052cf839bb8d37bb73bae51501ff88c9eff0ba89a23645010db39637ee5cabbb986cee836e546d0adb925ec5a2ee9114e5344aa65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "mpiP-3-5-gnu-mvapich2-hpc-devel"

inherit rpm
