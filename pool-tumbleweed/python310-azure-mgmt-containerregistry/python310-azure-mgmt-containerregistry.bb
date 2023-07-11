SUMMARY = "Microsoft Azure Container Registry Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python310-azure-mgmt-containerregistry-10.1.0-1.3.noarch.rpm"
RPM_HASH = "cc2e108872ebf5a4eebaff542ded077aa4ea32b4e876bcc320d0a7a3ac21723148c65a929959f67d4fd464de03b05d95839352f8d82da7c4079670f7206f6610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-containerregistry \
python310-azure-mgmt-containerregistry \
python3dist-azure-mgmt-containerregistry"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
