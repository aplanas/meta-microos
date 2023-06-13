SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python39-pytest-mpi-0.6-1.3.noarch.rpm"
RPM_HASH = "e2c8ea7b151cc371fa99033da50fd4fc585de8ee56bd433490ecd67009fe159e332c843e2709d925e920b05081af329373c926e2e5023fed7cad98728997bce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-mpi) \
python39-pytest-mpi \
python3dist(pytest-mpi)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
