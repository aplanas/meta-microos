SUMMARY = "Cirq quantum algorithms on AQT quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to Alpine Quantum Technologies quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python38-cirq-aqt-0.13.1-1.5.noarch.rpm"
RPM_HASH = "1ec7509ba44b45f6594b8f1eff0fc60362ecfd633578873433eaa68375aea1ea433970037f936a18740d4f5de61d16c021677d6c3542c3b541dc9a54359b9354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(cirq-aqt) \
python38-cirq-aqt \
python3dist(cirq-aqt)"

RDEPENDS:${PN} += "python(abi) \
python38-cirq-core \
python38-requests"

inherit rpm
