SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-maintenance-2.0.0-1.8.noarch.rpm"
RPM_HASH = "1874489a2cb66b297b724fb232970e21a0648db2ae606d419e976dcee36d4ec233ba6032bf511cf9985e6ef2df0fbd708ca5f0a62d3c58ddcb0361dc2d9af407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-maintenance \
python3.10dist(azure-mgmt-maintenance) \
python310-azure-mgmt-maintenance \
python3dist(azure-mgmt-maintenance)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
