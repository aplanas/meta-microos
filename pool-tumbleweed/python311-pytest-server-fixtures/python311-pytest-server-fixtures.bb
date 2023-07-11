SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-server-fixtures-1.7.0-8.6.noarch.rpm"
RPM_HASH = "c9eeb1ac858d1442402bf122f0f111fb15f076882e1b708b9d6611a6de42dbb21360ad24bf2e2939bf3b662af129a3b71592ee48b9b57fc6fe17f6e80f3c3857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-server-fixtures \
python3.11dist-pytest-server-fixtures \
python311-pytest-server-fixtures \
python3dist-pytest-server-fixtures"

RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python-abi \
python311-future \
python311-psutil \
python311-pytest \
python311-pytest-fixture-config \
python311-pytest-shutil \
python311-requests \
python311-retry"

inherit rpm
