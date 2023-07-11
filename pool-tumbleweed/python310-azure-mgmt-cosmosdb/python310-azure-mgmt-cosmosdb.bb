SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python310-azure-mgmt-cosmosdb-9.2.0-1.2.noarch.rpm"
RPM_HASH = "9930e5db49ac401571706410d82065704cffb2fa73067bcc20f30ce72a57595fd507a4069a50926debd90c47411878c1f623693cc09ea0da632db83647357c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-cosmosdb \
python310-azure-mgmt-cosmosdb \
python3dist-azure-mgmt-cosmosdb"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
