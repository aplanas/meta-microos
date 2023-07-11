SUMMARY = "Microsoft Azure Storage Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "Apache-2.0"

PV = "0.36.0"

RPM_NAME = "python39-azure-storage-0.36.0-3.16.noarch.rpm"
RPM_HASH = "1c547e1c3b5eddca54166c091b5a2000a4833a2d01bf1000766b47f3e35f786ab8044dd5d6a9970ac021f72c43dba2b543765105b0ce385d1bc6a43ebd1e28bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage \
python39-azure-sdk-storage \
python39-azure-storage \
python3dist-azure-storage"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-cryptography \
python39-python-dateutil \
python39-requests"

inherit rpm
