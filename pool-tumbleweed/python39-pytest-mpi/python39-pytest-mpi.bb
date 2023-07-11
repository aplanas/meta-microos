SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python39-pytest-mpi-0.6-1.5.noarch.rpm"
RPM_HASH = "7d122c22f36e768a525fabeb305334e9ac73b7ad8c59bd5b8326203615156d45a9b1eaa2dec32787df521a2577eb3edd02beea601a737674b5734d09490c46af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-mpi \
python39-pytest-mpi \
python3dist-pytest-mpi"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
