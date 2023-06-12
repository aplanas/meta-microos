SUMMARY = "MPI plugin for pytest"
DESCRIPTION = "mpi plugin for pytest to collect information from openmpi-based tests."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "python310-pytest-mpi-0.6-1.3.noarch.rpm"
RPM_HASH = "9d63cf8d19300c959f18ad44adfa6662505bec7d1459ff90cd9525cd651762c208ce045dd2666c992a4baa160635b6aecb597c723ff55f9f577e1e110d63fda1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mpi \
python3.10dist(pytest-mpi) \
python310-pytest-mpi \
python3dist(pytest-mpi)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
