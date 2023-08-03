SUMMARY = "Symmetry finder and symmetric Hamiltonian generator"
DESCRIPTION = "qsymm is a Python library that automatically generates model \
Hamiltonians from symmetry constraints and finds the full symmetry \
group of your Hamiltonian."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python39-qsymm-1.3.0-3.1.noarch.rpm"
RPM_HASH = "82c727ced1dd7109569d43804a0ebbfc5125f3278228c2cbc6178eaa6f4ed7ef15722b762897c9fb650305d050c0481a8beadd09261fa6424cc7ffea4b5bb601"
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
