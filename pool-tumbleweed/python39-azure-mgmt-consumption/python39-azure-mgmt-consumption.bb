SUMMARY = "Microsoft Azure Consumption Client Library"
DESCRIPTION = "This is the Microsoft Azure Consumption Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python39-azure-mgmt-consumption-10.0.0-1.4.noarch.rpm"
RPM_HASH = "7891aa26955575e179c8b0638d390470db79f307a82f1407ae7720336452373f89cb1b2a8063bfad5ae8899095815bf74d4cd946502d09f7f982cd6d1bc54f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-consumption \
python39-azure-mgmt-consumption \
python3dist-azure-mgmt-consumption"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
