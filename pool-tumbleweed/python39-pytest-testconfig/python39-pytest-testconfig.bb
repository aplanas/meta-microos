SUMMARY = "Test configuration plugin for pytest"
DESCRIPTION = "pytest-testconfig is a plugin to the pytest test framework used for passing test-specific (or test-run specific) configuration data \
to the tests being executed."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-pytest-testconfig-0.2.0-1.14.noarch.rpm"
RPM_HASH = "179f24f1116f94ec9f2530a84124417cc862788d04f4310e25e0f023c1dff8e4b7e0fc0bf24cbe010115b0b4e4e0db28111501ae63c4adc22830fd58a8351328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-testconfig \
python39-pytest-testconfig \
python3dist-pytest-testconfig"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
