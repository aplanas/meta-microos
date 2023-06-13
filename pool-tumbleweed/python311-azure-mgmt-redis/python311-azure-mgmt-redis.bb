SUMMARY = "Microsoft Azure Redis Cache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Redis Cache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.1.0"

RPM_NAME = "python311-azure-mgmt-redis-14.1.0-1.3.noarch.rpm"
RPM_HASH = "a51f7454a814f3ca17570963f388e271d0d20bad031f95e49cc1a6922fcddc369aa1dbc0a5d4847a17e98156403236b40d3fd093764f10cc942e735725240d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-redis) \
python311-azure-mgmt-redis \
python3dist(azure-mgmt-redis)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
