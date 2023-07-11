SUMMARY = "Microsoft Azure Databricks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Databricks Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-databricks-2.0.0-1.1.noarch.rpm"
RPM_HASH = "d430a5d7ca6049ec21938476582dd823f39e45ade490f6a299bb8cf0ce6cd9bdde95ef9496f52ce14f96b4de07c65098c6cdb463511db4557fd5c54f7a36b1bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-databricks \
python310-azure-mgmt-databricks \
python3dist-azure-mgmt-databricks"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
