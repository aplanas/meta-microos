SUMMARY = "Microsoft Azure Storagecache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storagecache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-azure-mgmt-storagecache-1.5.0-1.1.noarch.rpm"
RPM_HASH = "119cf0803794791b7404d4cc235d19adb7d8b1edecab1b83b4abd81ee68e9ed43818b9e3fd22620edca6ae711473b78bb3ab2b447beb6e64691b9c81f6576de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-storagecache \
python310-azure-mgmt-storagecache \
python3dist-azure-mgmt-storagecache"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
