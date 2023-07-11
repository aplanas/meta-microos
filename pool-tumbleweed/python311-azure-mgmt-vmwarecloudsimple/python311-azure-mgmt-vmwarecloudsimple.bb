SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-mgmt-vmwarecloudsimple-0.2.0-2.12.noarch.rpm"
RPM_HASH = "ddd432d6d21b474d84e9274b9e08598680351ce7dbb63cebd720a1796e7bd7ade4c3c2c2fd026f07fdec16d94e9a1cf71b01e96143c78dcc98ef8f22580abb61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-vmwarecloudsimple \
python3.11dist-azure-mgmt-vmwarecloudsimple \
python311-azure-mgmt-vmwarecloudsimple \
python3dist-azure-mgmt-vmwarecloudsimple"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
