SUMMARY = "Microsoft Azure Automation Client Library"
DESCRIPTION = "This is the Microsoft Azure Automation Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0b2"

RPM_NAME = "python311-azure-mgmt-automation-1.1.0b2-1.3.noarch.rpm"
RPM_HASH = "9058a91a608176808808354b0b0324088d728b2e269e1d2795b78a1a2fbbb064973c9a392e2e5dfad249d369ae880a06462a03be274e1365ffa786641042b0a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-automation) \
python311-azure-mgmt-automation \
python3dist(azure-mgmt-automation)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
