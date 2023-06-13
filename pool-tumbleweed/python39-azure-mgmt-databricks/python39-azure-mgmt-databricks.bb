SUMMARY = "Microsoft Azure Databricks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Databricks Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-databricks-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "886c906429eb683f5bc76f148a861f41aa76254b5af1ad501b017bc32b75d3d7e30f73978a2ea77ac9e838953d46a59ec75176ca5edbbf5ec8307e33bc34e4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-databricks) \
python39-azure-mgmt-databricks \
python3dist(azure-mgmt-databricks)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
