SUMMARY = "Microsoft Azure Market Place Ordering Client Library"
DESCRIPTION = "This is the Microsoft Azure Market Place Ordering Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-marketplaceordering-1.1.0-1.9.noarch.rpm"
RPM_HASH = "0f5464a82af4ddff4cdabb9d53b67a716384734b2469c4260a9a80a1c950f57f6fd618b57c2a18db40793bab0de9e0c0b02ca27143cbdb7ba06741d1cec1aaed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-marketplaceordering \
python3.11dist-azure-mgmt-marketplaceordering \
python311-azure-mgmt-marketplaceordering \
python3dist-azure-mgmt-marketplaceordering"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
