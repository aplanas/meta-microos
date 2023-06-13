SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python39-azure-cosmos-4.3.1-1.2.noarch.rpm"
RPM_HASH = "34a390c6c3b7d7d526dfcc48b78ecaa6801c8c99b442e0a1a7bda03c9b68bd78456e6e352eab71bfed548e1edb07576418648a5831cc41c466f89156f8dc09eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cosmos) \
python39-azure-cosmos \
python3dist(azure-cosmos)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg"

inherit rpm
