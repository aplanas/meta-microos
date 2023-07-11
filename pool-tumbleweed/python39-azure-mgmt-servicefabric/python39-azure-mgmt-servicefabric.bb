SUMMARY = "Microsoft Azure Service Fabric Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-servicefabric-2.0.0-1.9.noarch.rpm"
RPM_HASH = "e0364329d7c27dcb40e8c3e18db889f0f36c2f4ef042bbfcbcb56c955a706bb3de38c74cd0683decd7b67f616ff3ddf4837b81ccfbcfd3cff27a3ebdb25f5f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-servicefabric \
python39-azure-mgmt-servicefabric \
python3dist-azure-mgmt-servicefabric"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
