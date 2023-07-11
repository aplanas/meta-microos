SUMMARY = "Test configuration plugin for pytest"
DESCRIPTION = "pytest-testconfig is a plugin to the pytest test framework used for passing test-specific (or test-run specific) configuration data \
to the tests being executed."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-pytest-testconfig-0.2.0-1.16.noarch.rpm"
RPM_HASH = "4746f64b52b50608e6da9e89f261acf198169de1ce5d167f1e610be634213084046135b549b9c78044f8fc60cbf33682b3d49b8fc61444289974ffe27619a21b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-testconfig \
python39-pytest-testconfig \
python3dist-pytest-testconfig"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
