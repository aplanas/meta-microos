SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Virtual Machine Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b5"

RPM_NAME = "python311-azure-mgmt-sqlvirtualmachine-1.0.0b5-1.3.noarch.rpm"
RPM_HASH = "ff1780adee9ebfd7dd8f72daf6551d0d5239a335bc2561f02b37f07c5b1b3fb7c7e49bd4523f1851d1d04844f201d1ea9801e23cb56a05b0f83f52a5e533fac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-sqlvirtualmachine) \
python311-azure-mgmt-sqlvirtualmachine \
python3dist(azure-mgmt-sqlvirtualmachine)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
