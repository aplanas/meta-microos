SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-maintenance-2.0.0-1.8.noarch.rpm"
RPM_HASH = "99f4073a7b73fb587342d4994551f6a2c3521596fe3aecf8b8a3c1c848fed593a9dbce9660c9cf897a3dc73bb71411cb24960438603ece8117fdfab9a9b5b698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-maintenance) \
python311-azure-mgmt-maintenance \
python3dist(azure-mgmt-maintenance)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
