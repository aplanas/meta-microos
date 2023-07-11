SUMMARY = "Microsoft Azure Billing Client Library"
DESCRIPTION = "This is the Microsoft Azure Billing Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python310-azure-mgmt-billing-6.0.0.0-1.4.noarch.rpm"
RPM_HASH = "0f3a4ec682919f85fa368320e5aea466c7a51dd2bb7a2805a27fd6450911f45cdee0ce20c79a61526416df8e74a6b99519ad4b5fed98b6d962e6ec631e447576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-billing \
python310-azure-mgmt-billing \
python3dist-azure-mgmt-billing"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
