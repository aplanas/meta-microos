SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python311-pytest-freezegun-0.4.2-3.3.noarch.rpm"
RPM_HASH = "e5fb8ed073fa8c5ab967222faa76797c27224d12299c69a9875582190d06276dcadd266705c1746d3a09e9c5f6cb0d7aad54fb7c8fc5de48a1e22f33f0389d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-freezegun \
python3.11dist-pytest-freezegun \
python311-pytest-freezegun \
python3dist-pytest-freezegun"

RDEPENDS:${PN} += "python-abi \
python311-freezegun \
python311-pytest"

inherit rpm
