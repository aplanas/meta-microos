SUMMARY = "Microsoft Azure Service Bus Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python311-azure-mgmt-servicebus-8.2.0-1.4.noarch.rpm"
RPM_HASH = "f18139df281b727eae3aeb78cfdd547c294a71507d70c892d2eafb2ed95c6e85b27905c7e438c5f538935e70eeca896f817cbcbdc31af4b94cd007fa9fdcf0df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicebus \
python3.11dist-azure-mgmt-servicebus \
python311-azure-mgmt-servicebus \
python3dist-azure-mgmt-servicebus"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
