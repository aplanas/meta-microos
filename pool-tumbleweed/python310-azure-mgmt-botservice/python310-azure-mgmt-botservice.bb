SUMMARY = "Microsoft Azure Bot Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Bot Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0.0"

RPM_NAME = "python310-azure-mgmt-botservice-2.0.0.0-1.4.noarch.rpm"
RPM_HASH = "9c17f899be9155e567943aa5062b4b6d801e181c9f8caf7eb5c4168a8e0c988f5fc1ebb920ef5d95b8a2448e4bc4afa8bbd789823f350e5dfaff46d9382aa120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-botservice \
python310-azure-mgmt-botservice \
python3dist-azure-mgmt-botservice"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
