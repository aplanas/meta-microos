SUMMARY = "Microsoft Azure AzureStack Management Client Library"
DESCRIPTION = "This is the Microsoft Azure AzureStack Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-azurestack-1.0.0-1.9.noarch.rpm"
RPM_HASH = "88d625d7b0164a6947a62f0e7240eccef6631889becf90f4544a3370da608aa88d07e95c32ec4f69321f797667ff566fc1d1000dc237c682c80d861e3a8add63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-azurestack \
python39-azure-mgmt-azurestack \
python3dist-azure-mgmt-azurestack"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
