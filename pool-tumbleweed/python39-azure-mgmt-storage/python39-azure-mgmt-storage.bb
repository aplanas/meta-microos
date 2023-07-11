SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python39-azure-mgmt-storage-21.0.0-1.4.noarch.rpm"
RPM_HASH = "bca482b94f620478aa52e7176bc8b6996b1c73d4b1bf2d79b5bf76857ff51caffc6d6717af8d457f721152dd6389dff4ce65ce4e27c2b5edc4df7d38bae797b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-storage \
python39-azure-mgmt-storage \
python3dist-azure-mgmt-storage"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
