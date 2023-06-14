SUMMARY = "Symmetry finder and symmetric Hamiltonian generator"
DESCRIPTION = "qsymm is a Python library that automatically generates model \
Hamiltonians from symmetry constraints and finds the full symmetry \
group of your Hamiltonian."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "python311-qsymm-1.3.0-2.10.noarch.rpm"
RPM_HASH = "75f448f8e80b87b967b91d3dfcd72a1b62e905cc8e7baa8c117c6f752483d26c3cec3228744123304be79f17b9d6f77d605b0028b3d20247f53677fcf77657b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-qsymm \
python311-qsymm \
python3dist-qsymm"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy \
python311-sympy \
python311-tinyarray"

inherit rpm
