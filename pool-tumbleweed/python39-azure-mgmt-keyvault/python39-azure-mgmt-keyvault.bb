SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.2"

RPM_NAME = "python39-azure-mgmt-keyvault-10.2.2-1.1.noarch.rpm"
RPM_HASH = "3e5e747a9b0252e3979d9a15eba7da3e1242839790009f2592d677cb763a67e21cf99c256a8a7cf77128628d45e70090f5316893534a8303d4d755351b98924c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-keyvault \
python39-azure-mgmt-keyvault \
python3dist-azure-mgmt-keyvault"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
