SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-databoxedge-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "71909ad022c4875f85f120c338ee552668251df415b0e1cd99be939d0aa2706bb21d03e0036dce8b459f53cd724543c8e98d1c0764696bf3b0b590276d4e2a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-databoxedge \
python310-azure-mgmt-databoxedge \
python3dist-azure-mgmt-databoxedge"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
