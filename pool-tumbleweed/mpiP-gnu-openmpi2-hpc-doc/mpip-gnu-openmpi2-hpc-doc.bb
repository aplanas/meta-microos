SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi2-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi2-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-openmpi2-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi2-hpc-doc-3.5-3.3.noarch.rpm"
RPM_HASH = "955eb4f3ac958b6e66b75ba8ef3329746c9d28b39dd8123f663ec44f3d6502a906dc57a6cb2c970f63051a8b028f343f82867e1631aa9e9e54f34b99185b54c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi2-hpc-doc"
RDEPENDS:${PN} += "mpiP_3_5-gnu-openmpi2-hpc-doc"

inherit rpm
