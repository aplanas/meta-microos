SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.3"

RPM_NAME = "python310-azure-mgmt-keyvault-10.2.3-1.1.noarch.rpm"
RPM_HASH = "6686513070b8051508040ab7455a4f01727b004afd40a29ba2724e64eff198de51280fa7f8c2de9e8de18a849f23f61f3b1c64b2a3821102a25a39be808675cc"
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
