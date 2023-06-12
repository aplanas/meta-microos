SUMMARY = "Cirq quantum algorithms on IonQ quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to IonQ quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python38-cirq-ionq-0.13.1-1.5.noarch.rpm"
RPM_HASH = "e05b4ae0d432d285c0e3e0050b47c9a81997b96892fa8bb8f77c85f1dd7594bce80ce287b3175ce6fb19c4b2ac1071a51a55aa4a7142b9f9680f95eef0da43f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(cirq-ionq) \
python38-cirq-ionq \
python3dist(cirq-ionq)"
RDEPENDS:${PN} += "python(abi) \
python38-cirq-core \
python38-requests"

inherit rpm
