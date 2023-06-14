SUMMARY = "Microsoft Azure Reservations Client Library"
DESCRIPTION = "This is the Microsoft Azure Reservations Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-azure-mgmt-reservations-2.3.0-1.2.noarch.rpm"
RPM_HASH = "c24605ecfe0bc95a07c5b336f76ef8478d2939e5bc303bac335b0a076d0f635f5dcf370333cdaa017f30a33d0fbb914837e0baf50b15be881fc631afdab216d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-reservations \
python311-azure-mgmt-reservations \
python3dist-azure-mgmt-reservations"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
