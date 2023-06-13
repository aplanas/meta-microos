SUMMARY = "Symmetry finder and symmetric Hamiltonian generator"
DESCRIPTION = "qsymm is a Python library that automatically generates model \
Hamiltonians from symmetry constraints and finds the full symmetry \
group of your Hamiltonian."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python310-qsymm-1.3.0-2.10.noarch.rpm"
RPM_HASH = "4c227b8d475c73db85081df12c67cdb8d6e2999ee7d23e897f85bf9884184cc3346ab70aa9741cd7cfec2729cb518acac8e8a514543b9fcd7b1422e2d6ffe38a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qsymm \
python3.10dist(qsymm) \
python310-qsymm \
python3dist(qsymm)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-scipy \
python310-sympy \
python310-tinyarray"

inherit rpm
