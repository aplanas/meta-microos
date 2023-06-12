SUMMARY = "Microsoft Azure AzureStack Management Client Library"
DESCRIPTION = "This is the Microsoft Azure AzureStack Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-azurestack-1.0.0-1.8.noarch.rpm"
RPM_HASH = "a1257b349544b46662f7a2dc072f4c071701a45cdc72ebb990949e1ff41c685a1b746f094c0da79dae93f213abe4b819d2cba6df3ccf72863adb4d28d7ae1e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurestack \
python3.10dist(azure-mgmt-azurestack) \
python310-azure-mgmt-azurestack \
python3dist(azure-mgmt-azurestack)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
