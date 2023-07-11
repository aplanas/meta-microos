SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-datashare-1.0.0.0-1.14.noarch.rpm"
RPM_HASH = "bb49b5572e837593aced80aad70da40d000d5cf1c58f28bb094b58eaf8b4094aadd31c8d04e395457a913338b26b72c23036871214aaf88fc74190adace65f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datashare \
python3.11dist-azure-mgmt-datashare \
python311-azure-mgmt-datashare \
python3dist-azure-mgmt-datashare"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
