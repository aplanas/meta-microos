SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.2"

RPM_NAME = "python310-azure-mgmt-keyvault-10.2.2-1.2.noarch.rpm"
RPM_HASH = "784363d12db32da5ab3fa77ba744eb0b078694961657020ba0494ca5994f1ca3f92350ae5e81fe4c33f3e071bffc88453c983ab6f8d34aca50a3fb0deb39d908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-keyvault \
python310-azure-mgmt-keyvault \
python3dist-azure-mgmt-keyvault"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
