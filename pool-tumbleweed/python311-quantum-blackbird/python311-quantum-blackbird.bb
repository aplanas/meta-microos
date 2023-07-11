SUMMARY = "Quantum assembly language for continuous-variable quantum computation"
DESCRIPTION = "Blackbird is a quantum assembly language for continuous-variable quantum \
computation, that can be used to program Xanadu's quantum photonics \
hardware and Strawberry Fields simulator."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python311-quantum-blackbird-0.5.0-1.5.noarch.rpm"
RPM_HASH = "4a80e2297e58fa61913fa078bd16ab30b558958ba8115a42d541e28b9b609f149bd5b431eae3f64b38e70514dd991cdf2764f8c4ca90235ed410e82bc0e58b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quantum-blackbird \
python3.11dist-quantum-blackbird \
python311-quantum-blackbird \
python3dist-quantum-blackbird"

RDEPENDS:${PN} += "python-abi \
python311-antlr4-python3-runtime \
python311-networkx \
python311-numpy \
python311-sympy"

inherit rpm
