SUMMARY = "Microsoft Azure Consumption Client Library"
DESCRIPTION = "This is the Microsoft Azure Consumption Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python311-azure-mgmt-consumption-10.0.0-1.5.noarch.rpm"
RPM_HASH = "95e874c12d9427a05b2636972ae6753231af0a323a671d1edf7982fd44183b8e7dc3f90e23e434aa9c02b08cf0d0d66f619d60e562acdb30c287c1e1f3459a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-consumption \
python3.11dist-azure-mgmt-consumption \
python311-azure-mgmt-consumption \
python3dist-azure-mgmt-consumption"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
