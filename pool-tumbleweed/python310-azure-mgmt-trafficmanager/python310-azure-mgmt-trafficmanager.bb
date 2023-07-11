SUMMARY = "Microsoft Azure Traffic Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Traffic Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-trafficmanager-1.1.0-1.1.noarch.rpm"
RPM_HASH = "3f38b3d90b5ca6d84575ccdcd7438f42f9373dff60366dda2047ab000390d99c5810f24c7e12a16851043cc77f77a47e762050d02cfd578eb27e1a23af5f323e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-trafficmanager \
python310-azure-mgmt-trafficmanager \
python3dist-azure-mgmt-trafficmanager"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
