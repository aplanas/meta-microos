SUMMARY = "Microsoft Azure Storage Sync Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Sync Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-storagesync-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "b86ab771a4e9a1a45527b57d57a1bd5e4dc552e5243d607dc12471650e6de700e634cd896997258793c025fe9bbbc03e1ddf940b0da9655395c2cef3fce5eea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-storagesync \
python39-azure-mgmt-storagesync \
python3dist-azure-mgmt-storagesync"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
