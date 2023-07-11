SUMMARY = "Microsoft Azure Billing Client Library"
DESCRIPTION = "This is the Microsoft Azure Billing Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python311-azure-mgmt-billing-6.0.0.0-1.4.noarch.rpm"
RPM_HASH = "05426c381219f05e41acf2f4b7d4c4b7e2843e4db11006a2d6249dcb94b304f8abd93d964bf1f1a02cf8dccfc326575475461dd9ad765fad6759b633a6bc8de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-billing \
python3.11dist-azure-mgmt-billing \
python311-azure-mgmt-billing \
python3dist-azure-mgmt-billing"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
