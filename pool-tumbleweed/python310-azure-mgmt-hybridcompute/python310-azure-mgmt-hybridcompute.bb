SUMMARY = "Microsoft Azure Hybrid Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Hybrid Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-hybridcompute-8.0.0-1.3.noarch.rpm"
RPM_HASH = "5e3779d943cd547768a7eef7f3d996da14fd41b81b43d76582fe66739abe83fb7207b1f95920669c31527fa9782076fb264ee3aa909212545eeae3381369f04c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-hybridcompute \
python310-azure-mgmt-hybridcompute \
python3dist-azure-mgmt-hybridcompute"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
