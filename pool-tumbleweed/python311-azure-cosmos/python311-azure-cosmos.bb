SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python311-azure-cosmos-4.4.0-1.2.noarch.rpm"
RPM_HASH = "ceeb2201bab83ff24ad579f8fdc210639639623b23c279ae65b3bd4f2af02267cbfd9e3f7761bf9bd6e0b64af64a1e5587347447a533118f1b9ee92fea6388f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cosmos \
python3.11dist-azure-cosmos \
python311-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg"

inherit rpm
