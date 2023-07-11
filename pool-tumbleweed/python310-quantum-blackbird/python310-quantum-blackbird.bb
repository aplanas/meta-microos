SUMMARY = "Quantum assembly language for continuous-variable quantum computation"
DESCRIPTION = "Blackbird is a quantum assembly language for continuous-variable quantum \
computation, that can be used to program Xanadu's quantum photonics \
hardware and Strawberry Fields simulator."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python310-quantum-blackbird-0.5.0-1.5.noarch.rpm"
RPM_HASH = "48c316b7192da1f99ed8c1cdef7930ad69d7b2b5efd0a3916529861896582dbfff41a50d03305cee647a72ef035f53a5130cf0282ac59cc1722e8780602f0470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-quantum-blackbird \
python310-quantum-blackbird \
python3dist-quantum-blackbird"

RDEPENDS:${PN} += "python-abi \
python310-antlr4-python3-runtime \
python310-networkx \
python310-numpy \
python310-sympy"

inherit rpm
