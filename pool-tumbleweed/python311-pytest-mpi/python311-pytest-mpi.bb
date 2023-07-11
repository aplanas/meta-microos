SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python311-pytest-mpi-0.6-1.5.noarch.rpm"
RPM_HASH = "39a79d253de9056e641f5c7f31d0c8cee65a816b6937ffa54c93f3a380df745769184fe79885495c558066293b018c723625ddfc84a6216ad65dfdf51aa64df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mpi \
python3.11dist-pytest-mpi \
python311-pytest-mpi \
python3dist-pytest-mpi"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
