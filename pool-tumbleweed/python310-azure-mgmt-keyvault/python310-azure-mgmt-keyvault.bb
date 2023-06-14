SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.2"

RPM_NAME = "python310-azure-mgmt-keyvault-10.2.2-1.1.noarch.rpm"
RPM_HASH = "c81f139ae7dd691be8fd843486be85a59394e28e545d8d3fc03d878231a32bd19612d6ccee13b5b3a174c3c3715ebc0bd2fae30260aa831b5d254ca75f8c6f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-keyvault \
python3.10dist-azure-mgmt-keyvault \
python310-azure-mgmt-keyvault \
python3dist-azure-mgmt-keyvault"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
