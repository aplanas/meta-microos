SUMMARY = "Microsoft Azure Logz Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Logz Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-logz-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "bb3874ce414a4a98e8fb967cfda93dd915c415513756418b732e06cbd88399dcda22a7e6c8ff7b89cb75b63b66b944fbb4ff77a328f16e6917d37f34e07eae0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-logz \
python3.11dist-azure-mgmt-logz \
python311-azure-mgmt-logz \
python3dist-azure-mgmt-logz"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
