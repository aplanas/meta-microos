SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-healthcareapis-1.1.0-1.7.noarch.rpm"
RPM_HASH = "e7d271d70f869db81ea863bf8940f99f58e0016fb8de28a060dc276b422022ba1f9731817311d246f77ebef2195cdad92535422e7fbb176074c8b61fd349ab2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-healthcareapis \
python3.11dist-azure-mgmt-healthcareapis \
python311-azure-mgmt-healthcareapis \
python3dist-azure-mgmt-healthcareapis"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
