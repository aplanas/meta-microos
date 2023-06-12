SUMMARY = "Microsoft Azure Redis Cache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Redis Cache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.1.0"

RPM_NAME = "python310-azure-mgmt-redis-14.1.0-1.3.noarch.rpm"
RPM_HASH = "e0065478a6d8f3ae2661cb6d9f2ab8be4f29695ae8c63f1596b477d5508d737280f323688f4daeb52616820cf932422c668dcb7a5f9e2d7472deed773092d973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redis \
python3.10dist(azure-mgmt-redis) \
python310-azure-mgmt-redis \
python3dist(azure-mgmt-redis)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
