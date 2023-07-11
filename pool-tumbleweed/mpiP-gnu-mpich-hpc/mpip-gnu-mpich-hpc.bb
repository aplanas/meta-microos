SUMMARY = "Dependency package for mpiP_3_5-gnu-mpich-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mpich-hpc provides the dependency to get binary package mpiP_3_5-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mpich-hpc-3.5-3.4.noarch.rpm"
RPM_HASH = "01357807c7e472140a909b7d4c34e5b6d71c9c87fa2e5eb92a9f40e52eb02aecff2fbcdf5923923cd34627f5ade46d592961f3adcf2315f8f67b9e6fcb0f7b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpiP-3-5-gnu-mpich-hpc"

inherit rpm
