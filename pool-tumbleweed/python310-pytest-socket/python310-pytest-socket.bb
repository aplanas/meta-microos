SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-pytest-socket-0.6.0-1.1.noarch.rpm"
RPM_HASH = "ce6785cc5d5dd260062d0250850969d333ace33f807cf8359470041976296c2f0e46829f6875e3354faa547e201d9b3c06b06c9bcbacabd2b60d21818896b0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-socket \
python3.10dist(pytest-socket) \
python310-pytest-socket \
python3dist(pytest-socket)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
