SUMMARY = "Test configuration plugin for pytest"
DESCRIPTION = "pytest-testconfig is a plugin to the pytest test framework used for passing test-specific (or test-run specific) configuration data \
to the tests being executed."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-pytest-testconfig-0.2.0-1.16.noarch.rpm"
RPM_HASH = "14f7f53c885336c91c00394a2a39e2241d16e7cb2fb351238dfbb4c935d2620511078181a283542ac761f4878dca1d21209a6bd940933235b5d1d5f887b69da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-testconfig \
python310-pytest-testconfig \
python3dist-pytest-testconfig"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
