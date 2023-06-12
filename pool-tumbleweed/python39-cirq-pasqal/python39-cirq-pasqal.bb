SUMMARY = "Cirq quantum algorithms on Pasqal quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to Pasqal quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-cirq-pasqal-0.13.1-1.5.noarch.rpm"
RPM_HASH = "9770ee2573b7de162aa0334ed8261a687fb3f6fb3d052093183ab563f06b63345c3c77887695ab324fa2b3ebd726f663feede6a9398cdc431810bb519ea6de68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cirq-pasqal) \
python39-cirq-pasqal \
python3dist(cirq-pasqal)"
RDEPENDS:${PN} += "python(abi) \
python39-cirq-core \
python39-requests"

inherit rpm
