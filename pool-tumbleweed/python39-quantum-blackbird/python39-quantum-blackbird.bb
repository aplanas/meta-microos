SUMMARY = "Quantum assembly language for continuous-variable quantum computation"
DESCRIPTION = "Blackbird is a quantum assembly language for continuous-variable quantum \
computation, that can be used to program Xanadu's quantum photonics \
hardware and Strawberry Fields simulator."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python39-quantum-blackbird-0.5.0-1.3.noarch.rpm"
RPM_HASH = "c62bafcfd2e7d0726a4fd8f48ab9e6b47ee6cd70b08b6f093d872204556257e73b1fc2e9a97be2ad73b9596f0328941d943b537f73e018dd2cbea583baf69fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(quantum-blackbird) \
python39-quantum-blackbird \
python3dist(quantum-blackbird)"
RDEPENDS:${PN} += "python(abi) \
python39-antlr4-python3-runtime \
python39-networkx \
python39-numpy \
python39-sympy"

inherit rpm
