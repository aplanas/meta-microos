SUMMARY = "Microsoft Azure Redis Cache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Redis Cache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.2.0"

RPM_NAME = "python39-azure-mgmt-redis-14.2.0-1.1.noarch.rpm"
RPM_HASH = "49b5711e330859ab3e663c57c75b1c9adb254a8fa93bfe48bbdaf7bca7268880a7534de9b7e904350c4ed6a084802243884860fee3117f73b04db77c0896c16e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-redis \
python39-azure-mgmt-redis \
python3dist-azure-mgmt-redis"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
