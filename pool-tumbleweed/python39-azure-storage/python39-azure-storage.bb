SUMMARY = "Microsoft Azure Storage Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "Apache-2.0"

PV = "0.36.0"

RPM_NAME = "python39-azure-storage-0.36.0-3.14.noarch.rpm"
RPM_HASH = "63550cd0b803ae660a784cd804fdfe01093644946e891d5e12e31a7d5d19cafba457809ce6d7813988afcd08fe9991f8d6ca327301b2e798fc3d016fd0fa785c"
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
