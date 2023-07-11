SUMMARY = "Microsoft Azure Relay Client Library"
DESCRIPTION = "This is the Microsoft Azure Relay Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-relay-1.1.0-1.9.noarch.rpm"
RPM_HASH = "1b6dcdccf15460ea26db08a4c8f1b9af43c6ade5358031ea72d111ec993e2a15b25733184b72d1daf853284980d6ecd080bf091bd607f15da1c50995f6335c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-relay \
python39-azure-mgmt-relay \
python3dist-azure-mgmt-relay"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
