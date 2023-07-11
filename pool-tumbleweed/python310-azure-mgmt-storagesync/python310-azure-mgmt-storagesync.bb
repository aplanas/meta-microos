SUMMARY = "Microsoft Azure Storage Sync Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Sync Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-storagesync-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "b5848a494923c45aac79f4b69601ce2ba556e39fd1445c35a703f0d20c5c9d71dc60a649a767af03d04fe21b802b1d183b3185d55c323d57c05ed695c6a0947c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-storagesync \
python310-azure-mgmt-storagesync \
python3dist-azure-mgmt-storagesync"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
