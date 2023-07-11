SUMMARY = "Microsoft Azure Peering Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Peering Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-peering-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "1a367605494f2d61c561e702ce07cdaf53a8803466e465fe88c1247c735e4095d52779a2175d4113bcd1a3cf14d618e781663d08192e7617c11727f4a302fab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-peering \
python39-azure-mgmt-peering \
python3dist-azure-mgmt-peering"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
