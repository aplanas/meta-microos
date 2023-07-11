SUMMARY = "Microsoft Azure Management Groups Client Library"
DESCRIPTION = "This is the Microsoft Azure Management Groups Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-managementgroups-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "32d526b8f0e7ec0619044c84f400846e5a8c86f3b13b85d1fdc04d7727b1d24cb3b67753d573bd14fd70f538899f836ac54c30c069b5893eb1cdc7695daff0c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managementgroups \
python3.11dist-azure-mgmt-managementgroups \
python311-azure-mgmt-managementgroups \
python3dist-azure-mgmt-managementgroups"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
