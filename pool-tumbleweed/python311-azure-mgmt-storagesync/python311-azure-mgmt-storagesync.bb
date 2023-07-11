SUMMARY = "Microsoft Azure Storage Sync Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Sync Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-storagesync-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "5574d5c343fc2b9f8bd85c7f7c747511b0539f04b331a01eadb08896a4243d03a9949fde1f24ded5a9d0c8205ec4e604f3f5fa8f12553960eed72c185d642b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagesync \
python3.11dist-azure-mgmt-storagesync \
python311-azure-mgmt-storagesync \
python3dist-azure-mgmt-storagesync"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
