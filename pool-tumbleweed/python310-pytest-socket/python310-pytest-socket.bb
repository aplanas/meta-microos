SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-pytest-socket-0.6.0-1.3.noarch.rpm"
RPM_HASH = "f1b1117a258752136ed1d0277dc50a1dfd6ac5ae888a5d38519113573ced5119a02a799bb25572d04efbe2eece0146a17a58620e2b01aa7333dc3dd4db21a2ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-socket \
python310-pytest-socket \
python3dist-pytest-socket"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
