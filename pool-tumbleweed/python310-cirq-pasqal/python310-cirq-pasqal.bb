SUMMARY = "Cirq quantum algorithms on Pasqal quantum computers"
DESCRIPTION = "A Cirq package to simulate and connect to Pasqal quantum computers"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-cirq-pasqal-0.13.1-1.5.noarch.rpm"
RPM_HASH = "15e5d3908da6d29fa3428f136223b84ff4f17f11310d1959ade0e114f0a7e14b043953b915f11cbd17db104a246568ae2c541a69508c231316aaa2959881c9f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cirq-pasqal \
python3.10dist(cirq-pasqal) \
python310-cirq-pasqal \
python3dist(cirq-pasqal)"

RDEPENDS:${PN} += "python(abi) \
python310-cirq-core \
python310-requests"

inherit rpm
