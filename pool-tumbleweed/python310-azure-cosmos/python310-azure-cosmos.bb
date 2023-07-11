SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python310-azure-cosmos-4.4.0-1.2.noarch.rpm"
RPM_HASH = "2b0fece0733d51ccf620a69e8325a024df057e612f847351b5eb9d86576d6b774649784136827cf06ff6c5114f166cf751cf8b68a7824bac464397e9c08513da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cosmos \
python310-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg"

inherit rpm
