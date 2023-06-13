SUMMARY = "Microsoft Azure Billing Client Library"
DESCRIPTION = "This is the Microsoft Azure Billing Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python39-azure-mgmt-billing-6.0.0.0-1.3.noarch.rpm"
RPM_HASH = "12854589dad84fb2ce2387c6aaf1c9b6b59ff24f0c59fc4b3bd38b64a7ac1762cb5b8fc998a04ec5a18cf8198921f8e9ffeadf278a5dffddce4801ed88c64fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-billing) \
python39-azure-mgmt-billing \
python3dist(azure-mgmt-billing)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
