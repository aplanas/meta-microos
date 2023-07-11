SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python310-azure-mgmt-storage-21.0.0-1.4.noarch.rpm"
RPM_HASH = "e7b2f9d88334ef76672655612053e693a5ad0a44a321d44368672fb9dcbe223b33e66de2d59f3d684968d984c62b1709bb97a7ebdccf3306c1b48622e3d69521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-storage \
python310-azure-mgmt-storage \
python3dist-azure-mgmt-storage"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
