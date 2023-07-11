SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-datashare-1.0.0.0-1.14.noarch.rpm"
RPM_HASH = "bd42146f9b9ed51e554324749c26257a91653537bc7d564faa935c14ef196f401be4c08b91f5f69d5b37f5ddf64a94a17e492866f2318b19dbff5e6149154d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-datashare \
python39-azure-mgmt-datashare \
python3dist-azure-mgmt-datashare"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
