SUMMARY = "Symmetry finder and symmetric Hamiltonian generator"
DESCRIPTION = "qsymm is a Python library that automatically generates model \
Hamiltonians from symmetry constraints and finds the full symmetry \
group of your Hamiltonian."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python39-qsymm-1.3.0-2.10.noarch.rpm"
RPM_HASH = "6ab8ff566f4ea55d14199d8ab8ea025503830d82591e63dba5db47d1942ffd830b93fd013917bcf011526955edee8687690dc23c5c37f7850f73d2636dee31b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qsymm \
python39-qsymm \
python3dist-qsymm"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-scipy \
python39-sympy \
python39-tinyarray"

inherit rpm
