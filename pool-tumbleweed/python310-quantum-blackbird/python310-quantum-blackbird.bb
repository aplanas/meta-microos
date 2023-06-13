SUMMARY = "Quantum assembly language for continuous-variable quantum computation"
DESCRIPTION = "Blackbird is a quantum assembly language for continuous-variable quantum \
computation, that can be used to program Xanadu's quantum photonics \
hardware and Strawberry Fields simulator."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python310-quantum-blackbird-0.5.0-1.3.noarch.rpm"
RPM_HASH = "d0904dbdcd0d5d5b22f256bb40808fa43c7fe5ebb39b1cbbda603ac04a2a454675514b274c511e599d865cc643d01ead8926f4dc60015b5b0417c32cb8fd4266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quantum-blackbird \
python3.10dist(quantum-blackbird) \
python310-quantum-blackbird \
python3dist(quantum-blackbird)"

RDEPENDS:${PN} += "python(abi) \
python310-antlr4-python3-runtime \
python310-networkx \
python310-numpy \
python310-sympy"

inherit rpm
