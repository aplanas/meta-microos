SUMMARY = "Microsoft Azure Redis Cache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Redis Cache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.2.0"

RPM_NAME = "python310-azure-mgmt-redis-14.2.0-1.1.noarch.rpm"
RPM_HASH = "fe0b10be908e0a32398b403cfd8a8193dc4b77cd1a0b8febc6a0f936b75fac264c1fd7be417cec11cf4425e4aacb35d13335bbab091510103bdcd2be883a91fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-redis \
python310-azure-mgmt-redis \
python3dist-azure-mgmt-redis"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
