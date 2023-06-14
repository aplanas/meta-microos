SUMMARY = "Microsoft Azure Server Manager Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Server Manager Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-servermanager-2.0.0-4.11.noarch.rpm"
RPM_HASH = "e32a0c33430f4e1cbc6a9dc1bcbde8a280418b9f470cac9490b86a267a34c1a2898ea68a8d90cf51db01a28cc401ee9b6af5dc5acb9aef8a5ab6c0b4b6f13db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-servermanager \
python311-azure-mgmt-servermanager \
python3dist-azure-mgmt-servermanager"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
