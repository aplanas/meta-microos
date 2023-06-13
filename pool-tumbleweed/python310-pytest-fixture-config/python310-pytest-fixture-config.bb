SUMMARY = "Fixture configuration utils for pytest"
DESCRIPTION = "Fixture configuration utilities for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-fixture-config-1.7.0-3.3.noarch.rpm"
RPM_HASH = "a397d38e6e1f0f9039d4d242b8dd6a862d9f6e58a6c779e19b28919a7157d88fb9472b8ef8c306456568c1d434664b041c4ec057594aebd3210924ec14ac57c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-fixture-config \
python3.10dist(pytest-fixture-config) \
python310-pytest-fixture-config \
python3dist(pytest-fixture-config)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
