SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.0.0"

RPM_NAME = "python311-azure-mgmt-batch-17.0.0-1.4.noarch.rpm"
RPM_HASH = "b33b4bd2c119e110e3ac4656842a33084d71d6aed7d114c1ba379884606af5c294c5b78e090d0842e1db590678c96831a4f39a60e104f9fcdddb17bd1cb382ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-batch \
python3.11dist-azure-mgmt-batch \
python311-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
