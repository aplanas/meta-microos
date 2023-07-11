SUMMARY = "Microsoft Azure Databricks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Databricks Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-databricks-2.0.0-1.1.noarch.rpm"
RPM_HASH = "ba10d2ebe3cd800c012631ac3542c13db44789263d5f256dc7f4a6e470f56b38d2efb50a6d308b0ea74994ccdb2abc96c5877fbbbaae7e4e266ea98523b3d013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-databricks \
python39-azure-mgmt-databricks \
python3dist-azure-mgmt-databricks"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
