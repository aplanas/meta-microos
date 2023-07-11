SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python39-azure-mgmt-network-23.1.0-1.2.noarch.rpm"
RPM_HASH = "1e15ea01a4bad263fde6327ae71b0acc10360225424e476449ca5001d2c8755c25ac22520ac5ca2b892432a475b2d38a68aeb39ef795c3f29186f769d8373efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-network \
python39-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
