SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-mgmt-resourceconnector-1.0.0b4-1.2.noarch.rpm"
RPM_HASH = "56c9ec748fa265bbebe98d79c0399aec976aebaaf093b3262eb51aaeebdee353a1fe7909bac16b6faa1bcdbdfcceb5ab4d8035d1a8c474883e828d581a02c57f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourceconnector \
python3.11dist-azure-mgmt-resourceconnector \
python311-azure-mgmt-resourceconnector \
python3dist-azure-mgmt-resourceconnector"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
