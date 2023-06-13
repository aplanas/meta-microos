SUMMARY = "Microsoft Azure Storagecache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storagecache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-azure-mgmt-storagecache-1.4.0-1.3.noarch.rpm"
RPM_HASH = "4e36d00699e7dce7181201b5028e1f457522fcdfc4c50d4fd1f13bfa1b8faf75c0ee94d8cdd9e1fc65f7ecf5d9266f16252d2f74a90d8bc03b42401211f1e6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagecache \
python3.10dist(azure-mgmt-storagecache) \
python310-azure-mgmt-storagecache \
python3dist(azure-mgmt-storagecache)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
