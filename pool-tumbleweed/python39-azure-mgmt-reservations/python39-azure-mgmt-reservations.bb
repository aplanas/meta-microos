SUMMARY = "Microsoft Azure Reservations Client Library"
DESCRIPTION = "This is the Microsoft Azure Reservations Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-azure-mgmt-reservations-2.3.0-1.3.noarch.rpm"
RPM_HASH = "0e55784c5d52ab404dd40ca16a2d87b9a358a2cce760159e4c9573cf119ce8e78a5549994576c817c2655f8767ca2fe732e4b0e69b14689e25d2c1126f2c8bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-reservations \
python39-azure-mgmt-reservations \
python3dist-azure-mgmt-reservations"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
