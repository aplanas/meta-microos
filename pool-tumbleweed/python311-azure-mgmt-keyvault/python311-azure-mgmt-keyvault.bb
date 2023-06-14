SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.2"

RPM_NAME = "python311-azure-mgmt-keyvault-10.2.2-1.1.noarch.rpm"
RPM_HASH = "6b1b84bc1e9d39c547fac7232bd06e0b65f09b5a5e9e3f7ea096b4ace995eebdf9c15f4e017cb6606f01beee8e08cb9135b19c1319019ff28d06ef7f106caa5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-keyvault \
python311-azure-mgmt-keyvault \
python3dist-azure-mgmt-keyvault"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
