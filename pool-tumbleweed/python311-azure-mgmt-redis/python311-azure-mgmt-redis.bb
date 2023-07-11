SUMMARY = "Microsoft Azure Redis Cache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Redis Cache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.2.0"

RPM_NAME = "python311-azure-mgmt-redis-14.2.0-1.1.noarch.rpm"
RPM_HASH = "af6dd05db56d45539a9eee84bbcf653a265afd8557838e9786fcd49a2c07c933854c4e6455591d898d04f67e9a286f3a65d0b15c29b6439d8462e8c46e929907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redis \
python3.11dist-azure-mgmt-redis \
python311-azure-mgmt-redis \
python3dist-azure-mgmt-redis"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
