SUMMARY = "Microsoft Azure ManagementPartner Management Client Library"
DESCRIPTION = "This is the Microsoft Azure ManagementPartner Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-managementpartner-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "6f3b79d3ca95fb757f1d7f6d13638e03a9cc109b63a20be6bf3cc305e4786a427488d95f85e664482c5c87b05304031e4ffefe585c20f05fa4d39f81897068a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managementpartner \
python3.11dist-azure-mgmt-managementpartner \
python311-azure-mgmt-managementpartner \
python3dist-azure-mgmt-managementpartner"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
