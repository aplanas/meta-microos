SUMMARY = "Microsoft Azure Deployment Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Deployment Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-deploymentmanager-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "96f4431b0bf8ed3e6d2cdee8c20b22bfc31286d2ffff0add11dff329936763ceb4dfa3f8c93e8c71b0b5e33814f03cd812154c4ae647aafbaf6edab0ed2750f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-deploymentmanager \
python310-azure-mgmt-deploymentmanager \
python3dist-azure-mgmt-deploymentmanager"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
