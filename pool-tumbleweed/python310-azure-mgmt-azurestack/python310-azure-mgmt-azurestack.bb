SUMMARY = "Microsoft Azure AzureStack Management Client Library"
DESCRIPTION = "This is the Microsoft Azure AzureStack Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-azurestack-1.0.0-1.9.noarch.rpm"
RPM_HASH = "d42f65653dc84383be2ff233c0a7ece03d4d3f7eddb4f4f0d77318f45826e122abc0b1b9f13acd6104f1966fc2ce68ee4a5c769a8654504b3cc01b8d174619f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-azurestack \
python310-azure-mgmt-azurestack \
python3dist-azure-mgmt-azurestack"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
