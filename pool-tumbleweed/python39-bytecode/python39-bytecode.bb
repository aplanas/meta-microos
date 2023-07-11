SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.2"

RPM_NAME = "python39-bytecode-0.14.2-1.3.noarch.rpm"
RPM_HASH = "dc45d5d911ec7109940d1a3ad0db5a359c4dd42c81f27f9aa4b941e7e551adccfba437d94697d02650f782238d3fb9786b27f2ed8e2aebffe38062d53b31ea35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bytecode \
python39-bytecode \
python3dist-bytecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
