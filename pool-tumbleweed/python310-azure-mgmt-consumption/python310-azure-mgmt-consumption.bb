SUMMARY = "Microsoft Azure Consumption Client Library"
DESCRIPTION = "This is the Microsoft Azure Consumption Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python310-azure-mgmt-consumption-10.0.0-1.4.noarch.rpm"
RPM_HASH = "70c9a8af11c5ded41659554dfaf9fb967533ac5301a146f42b814ddfa22d85d6000752300feb118e15f4ea4dd441d90d407ab8c91a84bdf9296b8c10fc035233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-consumption \
python3.10dist(azure-mgmt-consumption) \
python310-azure-mgmt-consumption \
python3dist(azure-mgmt-consumption)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
