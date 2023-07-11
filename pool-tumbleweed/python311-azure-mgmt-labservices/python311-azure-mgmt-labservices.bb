SUMMARY = "Microsoft Azure Lab Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Lab Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-labservices-2.0.0-1.4.noarch.rpm"
RPM_HASH = "ec2a316075b07c0ace2d3bdd0ae0df1a67769f44b24fca65bfb6ed17dc1b83138a6a389f1fa5fa4747c87644e20da733defabe8d0414adfb919be231aeb6fc8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-labservices \
python3.11dist-azure-mgmt-labservices \
python311-azure-mgmt-labservices \
python3dist-azure-mgmt-labservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
