SUMMARY = "Microsoft Azure Market Place Ordering Client Library"
DESCRIPTION = "This is the Microsoft Azure Market Place Ordering Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-marketplaceordering-1.1.0-1.9.noarch.rpm"
RPM_HASH = "af2efe0214886b2229acc99b7b97a0184424b5492532dba5f7015e9b1022111c55fbbcb9b48d70d51c1f2fafbbeba10911624998c90dbec73b47eb07f856d5e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-marketplaceordering \
python39-azure-mgmt-marketplaceordering \
python3dist-azure-mgmt-marketplaceordering"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
