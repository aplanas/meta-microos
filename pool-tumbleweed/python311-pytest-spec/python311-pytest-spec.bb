SUMMARY = "Plugin to display pytest execution output like a specification"
DESCRIPTION = "pytest plugin to display test execution output like a specification."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "python311-pytest-spec-3.2.0-1.8.noarch.rpm"
RPM_HASH = "cf769146f27b88dc1cda787ace96da8ac96bf9d9a644291eea6252e41dd45180fdb2449ee5d6fe08011a76adc91a5990663ae9286bf6aff97a87d89f2d1795fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-spec \
python3.11dist-pytest-spec \
python311-pytest-spec \
python3dist-pytest-spec"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
