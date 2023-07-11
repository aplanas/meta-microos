SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python39-pytest-freezegun-0.4.2-3.3.noarch.rpm"
RPM_HASH = "4adea65b04fab74c5391eef2f004d74a3fcb005354b199d63c062956acde26105d93805993e2d25e3c63d95b154488393458aa01d9434d11f9dcce4e52111efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-freezegun \
python39-pytest-freezegun \
python3dist-pytest-freezegun"

RDEPENDS:${PN} += "python-abi \
python39-freezegun \
python39-pytest"

inherit rpm
