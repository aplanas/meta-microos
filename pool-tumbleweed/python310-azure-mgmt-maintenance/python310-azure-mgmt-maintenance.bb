SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-azure-mgmt-maintenance-2.1.0-1.1.noarch.rpm"
RPM_HASH = "ec4fd66555be4102d862e11c9693a7894ffdd654704b5924d03c7757c885cf21409ead1677b986e8ee80b59add88ed26a6dd955769d6af47c73e19a964aea8c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-maintenance \
python310-azure-mgmt-maintenance \
python3dist-azure-mgmt-maintenance"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
