SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-server-fixtures-1.7.0-8.4.noarch.rpm"
RPM_HASH = "4b104f70dcb5776e71f0341731e2deb7f45db599341b96eff79e52925ec61a74219d80db9a7cacec5dd0015ba6de3744b3c0a34982007be9232f92af8ec96e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-server-fixtures \
python39-pytest-server-fixtures \
python3dist-pytest-server-fixtures"

RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python-abi \
python39-future \
python39-psutil \
python39-pytest \
python39-pytest-fixture-config \
python39-pytest-shutil \
python39-requests \
python39-retry"

inherit rpm
