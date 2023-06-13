SUMMARY = "Microsoft Azure Management Groups Client Library"
DESCRIPTION = "This is the Microsoft Azure Management Groups Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-managementgroups-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "8dd16a728fb0618721902e490740b0207a2398ac5cd2d8e463d76e4815a5a68c6058963e2b2d21a0ffaea045426f69c9d6481e3c4d6a62a1e6b7528db83bfdfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-managementgroups) \
python311-azure-mgmt-managementgroups \
python3dist(azure-mgmt-managementgroups)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
