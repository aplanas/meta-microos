SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-server-fixtures-1.7.0-9.1.noarch.rpm"
RPM_HASH = "4f1f29aad9b526645dd6c817dbf96dae74c513aba5bac06ddfcf8b14d6c420148ffeef30dc3e5d251bdab3558f079a68ab9f6d53b2a4d2af9f3bba5895d6215d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-server-fixtures \
python3.11dist-pytest-server-fixtures \
python311-pytest-server-fixtures \
python3dist-pytest-server-fixtures"

RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python-abi \
python311-psutil \
python311-pytest \
python311-pytest-fixture-config \
python311-pytest-shutil \
python311-requests \
python311-retry"

inherit rpm
