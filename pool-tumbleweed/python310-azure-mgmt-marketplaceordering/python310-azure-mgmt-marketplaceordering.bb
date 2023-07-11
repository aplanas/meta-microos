SUMMARY = "Microsoft Azure Market Place Ordering Client Library"
DESCRIPTION = "This is the Microsoft Azure Market Place Ordering Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-marketplaceordering-1.1.0-1.9.noarch.rpm"
RPM_HASH = "4313b31408267c6e57e1316381c101c470900408d21c96f049513bb30210187a8aa4767fb294efc6d8133d896fd189d5d4a2b038a509a9c6e297dd12a552879a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-marketplaceordering \
python310-azure-mgmt-marketplaceordering \
python3dist-azure-mgmt-marketplaceordering"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
