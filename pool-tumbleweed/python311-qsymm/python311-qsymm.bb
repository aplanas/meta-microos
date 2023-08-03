SUMMARY = "Symmetry finder and symmetric Hamiltonian generator"
DESCRIPTION = "qsymm is a Python library that automatically generates model \
Hamiltonians from symmetry constraints and finds the full symmetry \
group of your Hamiltonian."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python311-qsymm-1.3.0-3.1.noarch.rpm"
RPM_HASH = "94d7ff5ecdc16268e57ed3a40b7bde18508558d0ffe83c9b3b3fba35296c6ef02b387190af9e9cfc9ddea781b6171c785caf683ec48ae62871d7d92b80c9e7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qsymm \
python3.11dist-qsymm \
python311-qsymm \
python3dist-qsymm"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy \
python311-sympy \
python311-tinyarray"

inherit rpm
