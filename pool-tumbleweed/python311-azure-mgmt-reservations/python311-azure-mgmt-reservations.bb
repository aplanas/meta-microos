SUMMARY = "Microsoft Azure Reservations Client Library"
DESCRIPTION = "This is the Microsoft Azure Reservations Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-azure-mgmt-reservations-2.3.0-1.3.noarch.rpm"
RPM_HASH = "160dbfe5ff806147c582ffc280447f0d6559ff2f95c36ef180b9196cddc2be085399105a239e6429f2394f7e815a3921d84d2d665b035b21e3db3bb6c5811df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-reservations \
python3.11dist-azure-mgmt-reservations \
python311-azure-mgmt-reservations \
python3dist-azure-mgmt-reservations"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
