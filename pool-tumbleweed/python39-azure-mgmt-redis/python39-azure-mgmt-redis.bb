SUMMARY = "Microsoft Azure Redis Cache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Redis Cache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.1.0"

RPM_NAME = "python39-azure-mgmt-redis-14.1.0-1.3.noarch.rpm"
RPM_HASH = "4ce1efee428fca0d3cdc0f1bf7784ea6b5f25eecf367e363f180e7e3bfd9f35bf3e856e8d4364f23bdda88bf0c9fa198c1e024eab2f52c9944bd47a5cdd33514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-redis) \
python39-azure-mgmt-redis \
python3dist(azure-mgmt-redis)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
