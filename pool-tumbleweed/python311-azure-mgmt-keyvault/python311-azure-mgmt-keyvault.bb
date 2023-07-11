SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.2"

RPM_NAME = "python311-azure-mgmt-keyvault-10.2.2-1.2.noarch.rpm"
RPM_HASH = "d52edffbc7cb74037362e168a1b55f0edeec276bab521d670253bf39cb7244325d7aaf3f30433ad382aed5f9924950b55f11dc57b0c11224df18749770d8b1d4"
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
