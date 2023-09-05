SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-server-fixtures-1.7.0-9.1.noarch.rpm"
RPM_HASH = "84f663bd4c37faa4212531ba84a71d8958d0f9751372bc3dadb3f5fbf74eb5d0a356cb0f404f49a6ea82f909e131ef9c2c8ad3f6974f3fd54e073e1954ba276f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-server-fixtures \
python310-pytest-server-fixtures \
python3dist-pytest-server-fixtures"

RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python-abi \
python310-psutil \
python310-pytest \
python310-pytest-fixture-config \
python310-pytest-shutil \
python310-requests \
python310-retry"

inherit rpm
