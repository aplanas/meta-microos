SUMMARY = "Microsoft Azure Storage Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "Apache-2.0"

PV = "0.36.0"

RPM_NAME = "python311-azure-storage-0.36.0-3.16.noarch.rpm"
RPM_HASH = "a780188b4c35bf2911a32ed4d6f6f05ea7e8675d6e24b6e2a90667c52d07d32e6a44f6de37c8d1a9ed2c6f10dd993ccb1d6dc7945cca51ae910c42ef801d657a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-sdk-storage \
python3-azure-storage \
python3.11dist-azure-storage \
python311-azure-sdk-storage \
python311-azure-storage \
python3dist-azure-storage"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-cryptography \
python311-python-dateutil \
python311-requests"

inherit rpm
