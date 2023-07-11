SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python39-pytest-metadata-2.0.4-2.3.noarch.rpm"
RPM_HASH = "4f1ab2c1a08e73db0d82138a86cd9b7297e2f1941e04bc16b3aed6147e2dd20fc714a86ab68045804d29e073a2c9e55c7cb73c9eb1af90e64e55ce29486e9609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-metadata \
python39-pytest-metadata \
python3dist-pytest-metadata"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
