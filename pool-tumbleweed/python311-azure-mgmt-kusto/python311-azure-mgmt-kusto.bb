SUMMARY = "Microsoft Azure Kusto Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kusto Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-azure-mgmt-kusto-3.1.0-1.2.noarch.rpm"
RPM_HASH = "ba8445c57129b0615ac21d208cda83aff5783bd1b2aacae8b0bc415615d13b1eb0a4464b529812107758a0f18a549e0b2d04f5deb08bac13f60943077e6b06bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-kusto) \
python311-azure-mgmt-kusto \
python3dist(azure-mgmt-kusto)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
