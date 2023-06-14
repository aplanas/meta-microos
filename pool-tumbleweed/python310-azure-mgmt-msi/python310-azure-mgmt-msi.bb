SUMMARY = "Microsoft Azure MSI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MSI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python310-azure-mgmt-msi-7.0.0-1.3.noarch.rpm"
RPM_HASH = "08479781b8405861029e69bc130c8971a4befba52fa046a89913bb6051323088e1f0dc970566b5194d7656d856515a9b588097a2ce2ee3a37e995ed102b71a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-msi \
python3.10dist-azure-mgmt-msi \
python310-azure-mgmt-msi \
python3dist-azure-mgmt-msi"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
