SUMMARY = "A simple network listener for py.test"
DESCRIPTION = "Simple JSON listener using TCP that listens for data and stores it in a queue for later retrieval."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-listener-1.7.0-4.3.noarch.rpm"
RPM_HASH = "6860b213066424274c4a98cac93a002e937071ef8b0738e49cc58552670f4009be89aac08b192906a9af52a67f0788625721e2800a9c73dc0fb22e361abd84ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-listener) \
python39-pytest-listener \
python3dist(pytest-listener)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest-server-fixtures"

inherit rpm
