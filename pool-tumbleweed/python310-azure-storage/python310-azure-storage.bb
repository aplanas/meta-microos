SUMMARY = "Microsoft Azure Storage Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "Apache-2.0"

PV = "0.36.0"

RPM_NAME = "python310-azure-storage-0.36.0-3.16.noarch.rpm"
RPM_HASH = "8382750a63d56e1076e294f1209cca66aeb508658fcc0eeaf8fd128180387e276073659fb781993eb17af0078908d88b1e90854d76f72229afc3fd93554347fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage \
python310-azure-sdk-storage \
python310-azure-storage \
python3dist-azure-storage"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-cryptography \
python310-python-dateutil \
python310-requests"

inherit rpm
