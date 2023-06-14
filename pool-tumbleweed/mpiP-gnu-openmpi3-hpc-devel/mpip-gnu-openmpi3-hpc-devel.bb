SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi3-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi3-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi3-hpc-devel-3.5-3.2.noarch.rpm"
RPM_HASH = "7b9481b55876b8ddf994486494bf9b4d661676dd615341932327cbe1c81fcb653d834f70fbfbef3d32036086c25e159ea11b34de51eb6b83566b723c89bb259b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-devel"

inherit rpm
