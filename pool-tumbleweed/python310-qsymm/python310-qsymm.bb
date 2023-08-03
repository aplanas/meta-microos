SUMMARY = "Symmetry finder and symmetric Hamiltonian generator"
DESCRIPTION = "qsymm is a Python library that automatically generates model \
Hamiltonians from symmetry constraints and finds the full symmetry \
group of your Hamiltonian."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python310-qsymm-1.3.0-3.1.noarch.rpm"
RPM_HASH = "e31933407d96c010951f5bfa8b003d375b9d0156eecc854add554d4cb42464cc7994b5d8587128f3fdf488cc951f5056a1924367c8d3062273e46feef99bcf0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qsymm \
python310-qsymm \
python3dist-qsymm"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy \
python310-sympy \
python310-tinyarray"

inherit rpm
