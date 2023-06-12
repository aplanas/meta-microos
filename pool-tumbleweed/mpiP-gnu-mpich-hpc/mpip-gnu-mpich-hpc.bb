SUMMARY = "Dependency package for mpiP_3_5-gnu-mpich-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mpich-hpc provides the dependency to get binary package mpiP_3_5-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mpich-hpc-3.5-3.3.noarch.rpm"
RPM_HASH = "5dd67d5b3cbcced58b3c90c4211c3d73b95e2a69d54ecb7cabbd6f0d6e6b97119c9d2fd544a7b90e2a2540fdff2abcc4818d81a1a273eee4f2edb5a5916dca0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mpich-hpc"
RDEPENDS:${PN} += "/bin/sh \
mpiP_3_5-gnu-mpich-hpc"

inherit rpm
