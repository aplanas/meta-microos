SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.1.0"

RPM_NAME = "python310-azure-mgmt-storage-21.1.0-1.1.noarch.rpm"
RPM_HASH = "0abbb7e76b954422d6aa4c552f53e5666313a96181a28823552d98cea0cb19028287ba4a3b64fed17d4c5b9d4f97a3f17aaa68099cfed07a15b66a6aab6ef67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-storage \
python310-azure-mgmt-storage \
python3dist-azure-mgmt-storage"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
