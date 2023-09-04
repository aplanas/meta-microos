SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-azure-mgmt-maintenance-2.1.0-1.1.noarch.rpm"
RPM_HASH = "06517ce32e85f42679970cd30877f03be12c49c95b5b7a6f7a49ca73cf64f0d227315a9902ff6272f91769aef76ed6806cac7a4fc40944aee695e14db184f2db"
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
python311-isodate"

inherit rpm
