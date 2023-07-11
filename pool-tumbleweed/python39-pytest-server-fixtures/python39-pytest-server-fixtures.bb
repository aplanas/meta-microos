SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-server-fixtures-1.7.0-8.6.noarch.rpm"
RPM_HASH = "1de3927d0ef38a43e461a9a6b1ba9c6ebfe6eb5419d27466ee894f0f2bbc429f0f50721f8c7588bdf2d0fbdc01c93187e5d82eee6b66e12eb9f6f2c16d306adf"
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
