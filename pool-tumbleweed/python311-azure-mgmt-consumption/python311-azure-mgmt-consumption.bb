SUMMARY = "Microsoft Azure Consumption Client Library"
DESCRIPTION = "This is the Microsoft Azure Consumption Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python311-azure-mgmt-consumption-10.0.0-1.4.noarch.rpm"
RPM_HASH = "e1bf2e4ee12d2776be896477b8c8d992b6b8ce697c42f87f2cec81284c65b15882f45c2e2aca39189c8e356c1c390bd4efc11e40c39f38cb2536706fe2580f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-consumption \
python311-azure-mgmt-consumption \
python3dist-azure-mgmt-consumption"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
