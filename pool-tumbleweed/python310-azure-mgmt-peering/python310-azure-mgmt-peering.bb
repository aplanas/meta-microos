SUMMARY = "Microsoft Azure Peering Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Peering Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-peering-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "96c6ada1c7491bd93ae730e7b281c654966aa8a650b1c158bdfcadbdeab4ac994a735c2fd0c5b0dce4ac6e7d2b279f08633e772cc383cf6a21c5a62b47ee4d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-peering \
python3.10dist(azure-mgmt-peering) \
python310-azure-mgmt-peering \
python3dist(azure-mgmt-peering)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
