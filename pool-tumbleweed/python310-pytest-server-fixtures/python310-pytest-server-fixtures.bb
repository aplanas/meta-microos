SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-server-fixtures-1.7.0-8.6.noarch.rpm"
RPM_HASH = "033f6b203713d353020512bf684b0def97922c6617e01a44d0789fd81cd6dc3dacc654ff1cd1445946bb86f88c5a87ef7f25463ccfd3f48cfebb30de722fc95a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-server-fixtures \
python310-pytest-server-fixtures \
python3dist-pytest-server-fixtures"

RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python-abi \
python310-future \
python310-psutil \
python310-pytest \
python310-pytest-fixture-config \
python310-pytest-shutil \
python310-requests \
python310-retry"

inherit rpm
