SUMMARY = "Microsoft Azure Market Place Ordering Client Library"
DESCRIPTION = "This is the Microsoft Azure Market Place Ordering Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-marketplaceordering-1.1.0-1.8.noarch.rpm"
RPM_HASH = "b63d64881186fcb8b542f9adbef021572492afb6e4b5d4a784059aa6ca810914492a8f621acaf7a2f984d8abb6f9fabfdfc076787abe8120017c07a829c50c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-marketplaceordering) \
python311-azure-mgmt-marketplaceordering \
python3dist(azure-mgmt-marketplaceordering)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
