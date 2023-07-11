SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python311-azure-mgmt-cosmosdb-9.2.0-1.2.noarch.rpm"
RPM_HASH = "ebd8b4c8e133d1f4b05106f40fa993e4dd4288e97157648a3eeabba64c1794f28d338ed8a8f81d04e25652b3630576986c0c661db5ab993710ff25f428e6411a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cosmosdb \
python3.11dist-azure-mgmt-cosmosdb \
python311-azure-mgmt-cosmosdb \
python3dist-azure-mgmt-cosmosdb"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
