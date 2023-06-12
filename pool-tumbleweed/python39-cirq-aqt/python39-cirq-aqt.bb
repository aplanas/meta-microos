SUMMARY = "Cirq quantum algorithms on AQT quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to Alpine Quantum Technologies quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-cirq-aqt-0.13.1-1.5.noarch.rpm"
RPM_HASH = "e3c931c44a8db8cbee8c02c65147194e67e16d9854612bf05a604d45f6de4bd0c095ddb12440ab1c427dc56d5a0bb66a68db98c60ca76e434b490f863832134a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cirq-aqt) \
python39-cirq-aqt \
python3dist(cirq-aqt)"
RDEPENDS:${PN} += "python(abi) \
python39-cirq-core \
python39-requests"

inherit rpm
