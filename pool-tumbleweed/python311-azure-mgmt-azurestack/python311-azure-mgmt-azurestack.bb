SUMMARY = "Microsoft Azure AzureStack Management Client Library"
DESCRIPTION = "This is the Microsoft Azure AzureStack Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-azurestack-1.0.0-1.9.noarch.rpm"
RPM_HASH = "e8f38a3fe96c24404b89437ebf049b958ed67e208fc1f04c7d16aced18217e9a8d9c041094c46aa2468772f5bb0db9f4dbeff752e23cde387333ee60554a672d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurestack \
python3.11dist-azure-mgmt-azurestack \
python311-azure-mgmt-azurestack \
python3dist-azure-mgmt-azurestack"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
