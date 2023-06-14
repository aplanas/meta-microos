SUMMARY = "Microsoft Azure Traffic Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Traffic Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-trafficmanager-1.0.0-1.6.noarch.rpm"
RPM_HASH = "95bdcfd530c4a7ab23cb73a7c3bce24a94e8bb4f444e76a648d896f716262af1e49bbbae8da1b6cf9e7745033c0bd8efa1f2acf502055997cfbe2a2c66716ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-trafficmanager \
python311-azure-mgmt-trafficmanager \
python3dist-azure-mgmt-trafficmanager"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
