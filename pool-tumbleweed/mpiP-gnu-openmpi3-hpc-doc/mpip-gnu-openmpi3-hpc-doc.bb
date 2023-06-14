SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi3-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi3-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-openmpi3-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi3-hpc-doc-3.5-3.2.noarch.rpm"
RPM_HASH = "807117b6821ac0d576eca19b3b7e4971dfefaac55f35bbd606a702b3ce63496fd975c81cc14381fc1f8fab21cc29f2fa8d258d5db7c57ca20c38b0d4b32c13e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-doc"

inherit rpm
