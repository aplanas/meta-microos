SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.3"

RPM_NAME = "python311-azure-mgmt-keyvault-10.2.3-1.1.noarch.rpm"
RPM_HASH = "6a8acaa12ebcc37e4c669c73a5038a2bf49b5f9f8a2d586c15928c61f37e4abb8fe25b053e776c40f85baa1d6797c1ba194b15cfac6ca5329e20811855b42356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-keyvault \
python3.11dist-azure-mgmt-keyvault \
python311-azure-mgmt-keyvault \
python3dist-azure-mgmt-keyvault"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
