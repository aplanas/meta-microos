SUMMARY = "Microsoft Azure Relay Client Library"
DESCRIPTION = "This is the Microsoft Azure Relay Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-relay-1.1.0-1.8.noarch.rpm"
RPM_HASH = "c374f84adc8acdf0955c9df5d4c2fb806bec874a5a90650802c178321fbcd9bc4f8dab7aec4c8cf0be04f67970639690b66b9a4a66340a28be03b647d5b1a1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-relay \
python311-azure-mgmt-relay \
python3dist-azure-mgmt-relay"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
