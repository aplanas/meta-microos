SUMMARY = "Microsoft Azure Managed Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Managed Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python311-azure-mgmt-managedservices-6.0.0.0-1.9.noarch.rpm"
RPM_HASH = "dcd8708cac44caff3a36425c0eac4bbca59d303e4959161faebe57536ca4124777a1b260ab829d5e26ab8751b35a8826883c5982436673556a46a8760fd32e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managedservices \
python3.11dist-azure-mgmt-managedservices \
python311-azure-mgmt-managedservices \
python3dist-azure-mgmt-managedservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
