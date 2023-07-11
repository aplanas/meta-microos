SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi1-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi1-hpc provides the dependency to get binary package mpiP_3_5-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi1-hpc-3.5-3.4.noarch.rpm"
RPM_HASH = "5b9223242c08033959dc9a6146cb6f5c50b0fdd768f3811be4ce6dd9439b3a316bc2e27230395db47f45423f55483d426e62cf05afb7bce27e49effcea3c1ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpiP-3-5-gnu-openmpi1-hpc"

inherit rpm
