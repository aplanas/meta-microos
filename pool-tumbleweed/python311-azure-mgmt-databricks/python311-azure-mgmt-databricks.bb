SUMMARY = "Microsoft Azure Databricks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Databricks Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-databricks-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "3360fae5f00ab8fa69f56d1925c6dac64e0d086dcf826eff5a5054950970359775e17e01943f81108e0cbe1c751a6d5d7839d5fc07e24c9c667dcfffb7144306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-databricks) \
python311-azure-mgmt-databricks \
python3dist(azure-mgmt-databricks)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
