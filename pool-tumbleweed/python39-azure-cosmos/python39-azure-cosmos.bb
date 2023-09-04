SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python39-azure-cosmos-4.5.0-1.1.noarch.rpm"
RPM_HASH = "94ccdaa79c1f446cd23d2b5895f9169b627f71a95f447214818bb23cf9df0aa1529282f20c9619dcad62aefd07493ea4da731ebf696829c6188bb0af4c5c7929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cosmos \
python39-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg"

inherit rpm
