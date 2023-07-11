SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi3-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi3-hpc provides the dependency to get binary package mpiP_3_5-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi3-hpc-3.5-3.3.noarch.rpm"
RPM_HASH = "3a433b50729552f9714fdc109537e47a5c5e7957037058e127914cfd31067e4ef24ffc4736c8329a64c7ed678c9edf8a99692f41754f279e874850027987286e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpiP-3-5-gnu-openmpi3-hpc"

inherit rpm
