SUMMARY = "A powerful implementation of MPI"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-testsuite-1.10.7-7.3.noarch.rpm"
RPM_HASH = "fd7213a09f082511b97a2dd0e480007908d199ec3b64941455c720dc30a81f5fd6cd4e925be7eb61b31043b31081bbe56e8f9e345b8e93fa62eb0a12d9fd2f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi1-libs"

inherit rpm
