SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python39-azure-mgmt-cosmosdb-9.2.0-1.1.noarch.rpm"
RPM_HASH = "fe621ac2410dfae4583d0aac7db4c09d05850673b5476ff921c7792d15c8ec6b3df93503fb0bf735da7e30bda2945c8063753296bdba9bbb6254ac0a5975d3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-cosmosdb) \
python39-azure-mgmt-cosmosdb \
python3dist(azure-mgmt-cosmosdb)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
