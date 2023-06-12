SUMMARY = "Microsoft Azure Traffic Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Traffic Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-trafficmanager-1.0.0-1.6.noarch.rpm"
RPM_HASH = "686a8fba02050f33e34a01d7ec8dc7e893e24d6f54c38447405b00c2c64071e68dfbd2437b8283de0306a78b94e0ae06c875c8c7cce07437de7735bf3e491f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-trafficmanager) \
python39-azure-mgmt-trafficmanager \
python3dist(azure-mgmt-trafficmanager)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
