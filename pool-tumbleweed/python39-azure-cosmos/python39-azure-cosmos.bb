SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python39-azure-cosmos-4.4.0-1.2.noarch.rpm"
RPM_HASH = "74fd70c00242a7af6788565e6708b51d336eefbc6e8c5f598d826476349e6885d08527802f6ed58c2e38a8cb76b2fde820d9103a1f0603da6a16d2d9d3bab7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-cosmos \
python39-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg"

inherit rpm
