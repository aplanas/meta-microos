SUMMARY = "Microsoft Azure Peering Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Peering Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-peering-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "d4e4d50de9be68c685bff9b396d56345a2d8c880b254fd87b2552569dc268ed47e3c5c113ca79a3280a2e80bff520f5d40768c33320549cb0ddfac2f5331fd72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-peering \
python3.11dist-azure-mgmt-peering \
python311-azure-mgmt-peering \
python3dist-azure-mgmt-peering"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
