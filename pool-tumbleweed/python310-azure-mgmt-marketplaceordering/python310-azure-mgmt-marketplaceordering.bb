SUMMARY = "Microsoft Azure Market Place Ordering Client Library"
DESCRIPTION = "This is the Microsoft Azure Market Place Ordering Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-marketplaceordering-1.1.0-1.8.noarch.rpm"
RPM_HASH = "10d7cff1b74f47e5757cec0bd94b3c6af7d1f81ffa3afd965d6f5f17211fa7abc0021cf92bf50fd61f619c88d700dde8575a81bbf3c95e962b24e3e5faad495b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-marketplaceordering \
python3.10dist(azure-mgmt-marketplaceordering) \
python310-azure-mgmt-marketplaceordering \
python3dist(azure-mgmt-marketplaceordering)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
