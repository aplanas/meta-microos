SUMMARY = "Microsoft Azure Service Fabric Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-servicefabric-2.0.0-1.9.noarch.rpm"
RPM_HASH = "ada88cc310534d4d0b2f011a9fd1f3ad05040d19f38673b268533a6251e5c395f7aac36e9c76f412fde351c0f5bc7e456903a01fdef26710b302892d25b88f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicefabric \
python3.11dist-azure-mgmt-servicefabric \
python311-azure-mgmt-servicefabric \
python3dist-azure-mgmt-servicefabric"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
