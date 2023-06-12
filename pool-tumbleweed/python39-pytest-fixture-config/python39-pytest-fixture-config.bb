SUMMARY = "Fixture configuration utils for pytest"
DESCRIPTION = "Fixture configuration utilities for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-fixture-config-1.7.0-3.3.noarch.rpm"
RPM_HASH = "2e5f57903cab0f297785cf9223ed522dc003e839a82c8e7909c18f232c6b910bf3f8a2148109dc7444f5fe51e67abc86121b8a6b89e7ea26a6cca3ce0ac2f941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-fixture-config) \
python39-pytest-fixture-config \
python3dist(pytest-fixture-config)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
