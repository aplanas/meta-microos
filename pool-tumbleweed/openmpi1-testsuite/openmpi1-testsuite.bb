SUMMARY = "A powerful implementation of MPI"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-testsuite-1.10.7-8.1.noarch.rpm"
RPM_HASH = "48d99728f9a83449b7b9ec89c6fbb9d35960eb5b37222a9b941759cbc0cbdd3fb87b3776978e41a1012cb122309940cbf5c8a9bbd6632dc1847d228cb70b4e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi1-libs"

inherit rpm
