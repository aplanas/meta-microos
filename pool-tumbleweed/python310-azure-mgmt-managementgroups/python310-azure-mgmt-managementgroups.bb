SUMMARY = "Microsoft Azure Management Groups Client Library"
DESCRIPTION = "This is the Microsoft Azure Management Groups Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-managementgroups-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "caa557ecc3d58d872a072d8719b65c8bf849fa341e28ecfe42f73ffc27e8350c02ffb52df7e508978733de96a037cbe9a05450ad1cb707ef8ce1f5096ad062b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managementgroups \
python3.10dist(azure-mgmt-managementgroups) \
python310-azure-mgmt-managementgroups \
python3dist(azure-mgmt-managementgroups)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
