SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python310-pytest-mpi-0.6-1.5.noarch.rpm"
RPM_HASH = "2155158c643bada93db9551574eeb7f9fec9cb4ce36917a63069a36c9329034b3fc6e0b1e1223924e65083b104b68357da8be9c49b162c03b0cfded6bc9241b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-mpi \
python310-pytest-mpi \
python3dist-pytest-mpi"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
