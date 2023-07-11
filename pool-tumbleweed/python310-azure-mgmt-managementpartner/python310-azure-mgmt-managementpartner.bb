SUMMARY = "Microsoft Azure ManagementPartner Management Client Library"
DESCRIPTION = "This is the Microsoft Azure ManagementPartner Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-managementpartner-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "3d07869d1c376c0b69bb3549911aad01018702ac03adeebf6ee34c48b80ca0746a5bbc33553244491f82a9933e1c093f06e4a386d98e2aae297b83c5a8ef7688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-managementpartner \
python310-azure-mgmt-managementpartner \
python3dist-azure-mgmt-managementpartner"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
