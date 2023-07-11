SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-maintenance-2.0.0-1.9.noarch.rpm"
RPM_HASH = "9c18061941b03c9bedd720c9dd3b5e7aa890977b98750356abc34cd48f03effbdd73ecf0d96d7ad111cbdbe6de31b7ba55077cccb12efadb130c3d15f5b803e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-maintenance \
python3.11dist-azure-mgmt-maintenance \
python311-azure-mgmt-maintenance \
python3dist-azure-mgmt-maintenance"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
