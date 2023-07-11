SUMMARY = "Microsoft Azure Advisor Client Library"
DESCRIPTION = "This is the Microsoft Azure Advisor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python311-azure-mgmt-advisor-9.0.0-1.11.noarch.rpm"
RPM_HASH = "c566fe63a8fb479c98baecd31e609701cc5d513ac827e4fbb36e4e5287f501a457612e7d31ba115520fb85fd13a4c1b2d4bd90ac74deec81d2bcfc92b8d08c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-advisor \
python3.11dist-azure-mgmt-advisor \
python311-azure-mgmt-advisor \
python3dist-azure-mgmt-advisor"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
