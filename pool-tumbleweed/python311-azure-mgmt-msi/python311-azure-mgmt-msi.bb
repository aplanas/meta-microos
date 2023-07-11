SUMMARY = "Microsoft Azure MSI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MSI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python311-azure-mgmt-msi-7.0.0-1.4.noarch.rpm"
RPM_HASH = "422a70efb200785abb0297f8a3eef8a046db1453ea54793dcb59a7dd6c5595c28e38d2dc2263b5c6de619407aba9bb4c268f0ad6ba7b80962885e56ef3eb96ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-msi \
python3.11dist-azure-mgmt-msi \
python311-azure-mgmt-msi \
python3dist-azure-mgmt-msi"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
