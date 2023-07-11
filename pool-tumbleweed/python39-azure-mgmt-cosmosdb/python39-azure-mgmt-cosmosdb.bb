SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python39-azure-mgmt-cosmosdb-9.2.0-1.2.noarch.rpm"
RPM_HASH = "ba162edf0888a8420c4f3632b2be30d22ba6037b423dfb7ddf89369896496d0117a40a6d70633b56215867684818e92209c435b4ba3032da6c148b3d7f23141d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-cosmosdb \
python39-azure-mgmt-cosmosdb \
python3dist-azure-mgmt-cosmosdb"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
