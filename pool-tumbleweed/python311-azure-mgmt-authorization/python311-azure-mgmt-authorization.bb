SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-authorization-3.0.0-1.4.noarch.rpm"
RPM_HASH = "0111828763996e6e44101e3fc6aa73dccbca35d22e0b5caf53bca984d00bdbeeec3829e5e1df937e44d307ff8b86c771522b9149431b013e30665d1dfbeacc0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-authorization \
python3.11dist-azure-mgmt-authorization \
python311-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm
