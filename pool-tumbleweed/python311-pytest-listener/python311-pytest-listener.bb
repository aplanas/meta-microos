SUMMARY = "A simple network listener for py.test"
DESCRIPTION = "Simple JSON listener using TCP that listens for data and stores it in a queue for later retrieval."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-listener-1.7.0-4.5.noarch.rpm"
RPM_HASH = "78f4b5b25ce39dbc9cf30d88f99baee6bdfebb5936d9f75e40545e85199529db686952b27dee10f77342162bdf22eca720136a9a7b90a4bb2b8b433ec13a02a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-listener \
python3.11dist-pytest-listener \
python311-pytest-listener \
python3dist-pytest-listener"

RDEPENDS:${PN} += "python-abi \
python311-pytest-server-fixtures"

inherit rpm
