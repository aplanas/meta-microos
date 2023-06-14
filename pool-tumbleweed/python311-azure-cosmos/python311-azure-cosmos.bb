SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python311-azure-cosmos-4.3.1-1.2.noarch.rpm"
RPM_HASH = "453b78e9f3081e94a89cebcc5a47c5d37edfa8c70828f81bc13d968b2f0f78776d2b4d02046c51e224f528235cd8ca4e9efa1c4781a89eefe9c06e60838db5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-cosmos \
python311-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg"

inherit rpm
