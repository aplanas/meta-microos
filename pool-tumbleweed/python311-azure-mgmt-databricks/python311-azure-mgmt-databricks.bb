SUMMARY = "Microsoft Azure Databricks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Databricks Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-databricks-2.0.0-1.1.noarch.rpm"
RPM_HASH = "5771c544bf338ef00d0ca6fc5aa11032bf3342f82c3a8157cea96db9a63cd6c5880a5529c80b33e289ad612f5f05345c88ac782daaaa8b7695e90b4375fa6a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databricks \
python3.11dist-azure-mgmt-databricks \
python311-azure-mgmt-databricks \
python3dist-azure-mgmt-databricks"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
