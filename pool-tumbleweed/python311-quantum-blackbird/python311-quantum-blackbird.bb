SUMMARY = "Quantum assembly language for continuous-variable quantum computation"
DESCRIPTION = "Blackbird is a quantum assembly language for continuous-variable quantum \
computation, that can be used to program Xanadu's quantum photonics \
hardware and Strawberry Fields simulator."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python311-quantum-blackbird-0.5.0-1.3.noarch.rpm"
RPM_HASH = "b5e1d776f93d8338b1afaa7e253935c1a407ecb79d2c8bd717c1c70bd23abca196a7a2f34f595cd2bd07fa8f30af6b12de979359719adb3c0bbb4bf44b94f5ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(quantum-blackbird) \
python311-quantum-blackbird \
python3dist(quantum-blackbird)"

RDEPENDS:${PN} += "python(abi) \
python311-antlr4-python3-runtime \
python311-networkx \
python311-numpy \
python311-sympy"

inherit rpm
