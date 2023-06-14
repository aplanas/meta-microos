SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python311-pytest-mpi-0.6-1.3.noarch.rpm"
RPM_HASH = "aba7c7c807ee28fc971730bdf4c21952a6d7ed5f71711b8ec5a28e99d1d3baa1f7e68f07ac854f35e563c8830a941d37dfe9144d6c711902d0b22c4cbe4d0e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-mpi \
python311-pytest-mpi \
python3dist-pytest-mpi"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
