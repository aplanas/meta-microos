SUMMARY = "Microsoft Azure Automation Client Library"
DESCRIPTION = "This is the Microsoft Azure Automation Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0b2"

RPM_NAME = "python311-azure-mgmt-automation-1.1.0b2-1.4.noarch.rpm"
RPM_HASH = "4e3fb7a2c653b5cb1d9f7b0d3a043125c8986ba04d4930dfd823a2c7c49cbabf77a3629fed8421ca6e1687b4534ce4bb157436150d281b05cfaa869cdd20050b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-automation \
python3.11dist-azure-mgmt-automation \
python311-azure-mgmt-automation \
python3dist-azure-mgmt-automation"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
