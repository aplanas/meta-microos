SUMMARY = "Quantum assembly language for continuous-variable quantum computation"
DESCRIPTION = "Blackbird is a quantum assembly language for continuous-variable quantum \
computation, that can be used to program Xanadu's quantum photonics \
hardware and Strawberry Fields simulator."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python39-quantum-blackbird-0.5.0-1.5.noarch.rpm"
RPM_HASH = "33fe77b2628b260e8bebe41f57e48a39f3a2d4df2513986b100e9f7c41b720af7772ee4141d93200638850e02d3e40a4567d0bd77bbcc0f91bce7ace94bccfed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-quantum-blackbird \
python39-quantum-blackbird \
python3dist-quantum-blackbird"

RDEPENDS:${PN} += "python-abi \
python39-antlr4-python3-runtime \
python39-networkx \
python39-numpy \
python39-sympy"

inherit rpm
