SUMMARY = "Cirq quantum algorithms on IonQ quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to IonQ quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-cirq-ionq-0.13.1-1.5.noarch.rpm"
RPM_HASH = "32df8b8985cce7c2943d759fa94d00777e3b55e41c8c9426d4fe736ca5b3f0c812c9eac90cab343498e482db2d94d26b1f515d32eda135d578c98a4e37060a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cirq-ionq \
python39-cirq-ionq \
python3dist-cirq-ionq"

RDEPENDS:${PN} += "python-abi \
python39-cirq-core \
python39-requests"

inherit rpm
