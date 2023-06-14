SUMMARY = "Microsoft Azure Reservations Client Library"
DESCRIPTION = "This is the Microsoft Azure Reservations Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-azure-mgmt-reservations-2.3.0-1.2.noarch.rpm"
RPM_HASH = "5e51a6e10a683f7b97a63f3fe02a703f6aada428a6fadd84806563d26b773601339da80e1fd59134b9ea1ca42edba1e6b64f12f803b863a3e6a672e9de503e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-reservations \
python3.10dist-azure-mgmt-reservations \
python310-azure-mgmt-reservations \
python3dist-azure-mgmt-reservations"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
