SUMMARY = "Fixture configuration utils for pytest"
DESCRIPTION = "Fixture configuration utilities for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-fixture-config-1.7.0-4.3.noarch.rpm"
RPM_HASH = "ba8aefccf08ef008b8efbacf71cc99727f0382bf742e2481ad6f580fcedb6c2837a6a9d06cab16f3c5f45a9a5f621b7054e42ddfdcd993229a44af71e2f99d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-fixture-config \
python39-pytest-fixture-config \
python3dist-pytest-fixture-config"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
