SUMMARY = "Microsoft Azure Billing Client Library"
DESCRIPTION = "This is the Microsoft Azure Billing Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python39-azure-mgmt-billing-6.0.0.0-1.4.noarch.rpm"
RPM_HASH = "36db022061efa5f420c2b98986d13fed4b1f56fa55b160df9c4f90f199cc22eabf4dd1c4cf959bf7fdf4f6f0739deba53058feb0f68a39ed4f1472211bc2390f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-billing \
python39-azure-mgmt-billing \
python3dist-azure-mgmt-billing"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
