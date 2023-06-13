SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-pytest-socket-0.6.0-1.1.noarch.rpm"
RPM_HASH = "679b28b78f9948b1cdf97269a39d9bccfa0c0ae7aad06bbf6e14d99d6d2e8c9f789e5ad78d5b1efc16b8b0ca36c623d46fda3f3a078c5f883ac9d650e8f54433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-socket) \
python39-pytest-socket \
python3dist(pytest-socket)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
