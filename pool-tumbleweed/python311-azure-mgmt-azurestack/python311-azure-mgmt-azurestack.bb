SUMMARY = "Microsoft Azure AzureStack Management Client Library"
DESCRIPTION = "This is the Microsoft Azure AzureStack Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-azurestack-1.0.0-1.8.noarch.rpm"
RPM_HASH = "a5c45662ae29df7b777fec9e8f188ec2d0eae3409b4e5293c41b68128cced900874f7fdfd8d5c402e3412c0b752e5b7c5e62b657cd8ffc894bcfa6237d0e81fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-azurestack) \
python311-azure-mgmt-azurestack \
python3dist(azure-mgmt-azurestack)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
