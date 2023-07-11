SUMMARY = "Microsoft Azure Subscription Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Subscription Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python311-azure-mgmt-subscription-3.1.1-1.4.noarch.rpm"
RPM_HASH = "bb2994543eb599d87c6a4947d4e8c40f72c2ce96c5f0a9a6ad65dbbba4133d649bc726662f964a0a6c375e2033254d91f96a76f771b7028432020843488faf44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-subscription \
python3.11dist-azure-mgmt-subscription \
python311-azure-mgmt-subscription \
python3dist-azure-mgmt-subscription"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
