SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-datashare-1.0.0.0-1.13.noarch.rpm"
RPM_HASH = "d5a7fa111c2e993eefc2a508a4ff5730255def1ca65e698db05a8571d0dbede35a889ab033e2e4ac67c4c7a30d94c249b61e6ba973a5d303da3a156a3b21fdf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-datashare) \
python311-azure-mgmt-datashare \
python3dist(azure-mgmt-datashare)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
