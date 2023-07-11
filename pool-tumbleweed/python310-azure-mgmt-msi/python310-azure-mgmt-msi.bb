SUMMARY = "Microsoft Azure MSI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MSI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python310-azure-mgmt-msi-7.0.0-1.4.noarch.rpm"
RPM_HASH = "8ff6061f3f78d7de911352fc1d2633213475e0461ffff3bf0169ddf55fd5c0f84dca7b8427e6683d50308be9ba97af004a4e4104e599ecc0981c9bd3ba7fc327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-msi \
python310-azure-mgmt-msi \
python3dist-azure-mgmt-msi"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
