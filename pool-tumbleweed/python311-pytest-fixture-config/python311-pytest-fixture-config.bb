SUMMARY = "Fixture configuration utils for pytest"
DESCRIPTION = "Fixture configuration utilities for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-fixture-config-1.7.0-4.3.noarch.rpm"
RPM_HASH = "ea7df84b324217d695d275122a50a15db28e653b3de8a540b38dee00e5012e2c44001eba0b4b0cc04e2993807d85559d1d82260861a315507d4627e02cb78684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-fixture-config \
python3.11dist-pytest-fixture-config \
python311-pytest-fixture-config \
python3dist-pytest-fixture-config"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
