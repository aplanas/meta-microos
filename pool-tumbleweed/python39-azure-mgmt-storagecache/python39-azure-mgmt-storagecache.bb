SUMMARY = "Microsoft Azure Storagecache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storagecache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-azure-mgmt-storagecache-1.5.0-1.1.noarch.rpm"
RPM_HASH = "90cc0d51b837f949eb09c2ae346d9205eb873301efe02119032ef47eed3c36ffacffe6f37664c8813b058d8abbd5e0aa80e629d81918f7a5135846550d91adae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-storagecache \
python39-azure-mgmt-storagecache \
python3dist-azure-mgmt-storagecache"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
