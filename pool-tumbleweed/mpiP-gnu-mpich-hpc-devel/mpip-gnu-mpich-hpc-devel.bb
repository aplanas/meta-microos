SUMMARY = "Dependency package for mpiP_3_5-gnu-mpich-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mpich-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mpich-hpc-devel-3.5-3.4.noarch.rpm"
RPM_HASH = "d271ce37a03610faf138f66a267037211b15466c09e2212d9f9766395d9364244d32d6836845d95dfb793f18bbde4e384691dd5aaffa2360be49c956013318a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "mpiP-3-5-gnu-mpich-hpc-devel"

inherit rpm
