SUMMARY = "Dependency package for mpiP_3_5-gnu-mpich-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mpich-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-mpich-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mpich-hpc-doc-3.5-3.3.noarch.rpm"
RPM_HASH = "46e8eba631ba340aa9a297bda2757464eb123d1751b803e7e73f3fca570e0989f30082789337b660723a5fb313632a73a0ba930e18ae9b9e5706273a05ab513c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += "mpiP_3_5-gnu-mpich-hpc-doc"

inherit rpm
