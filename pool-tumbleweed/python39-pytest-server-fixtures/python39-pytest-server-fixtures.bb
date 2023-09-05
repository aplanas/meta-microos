SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-server-fixtures-1.7.0-9.1.noarch.rpm"
RPM_HASH = "a678f8ceced1865db0d2472e18edb070606423bbf485afb2c651bf92674237802060abe9888eb9a44a593ea71d229c1b8e569acb89e04060d17c08099e707ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-server-fixtures \
python39-pytest-server-fixtures \
python3dist-pytest-server-fixtures"

RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python-abi \
python39-psutil \
python39-pytest \
python39-pytest-fixture-config \
python39-pytest-shutil \
python39-requests \
python39-retry"

inherit rpm
