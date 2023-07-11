SUMMARY = "Microsoft Azure Data Lake Store Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-datalake-store-1.0.0-1.11.noarch.rpm"
RPM_HASH = "8d3b3e45e56dfb551d449b07516bdaef3f6de78fe9ea5e2c2a1cf0aa957dae6515c94f75194303bc2e0773fe4d90d62eca994e2723dbff570b756180cedfb054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-store \
python3.11dist-azure-mgmt-datalake-store \
python311-azure-mgmt-datalake-store \
python3dist-azure-mgmt-datalake-store"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-datalake-nspkg \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
