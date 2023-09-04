SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python310-azure-cosmos-4.5.0-1.1.noarch.rpm"
RPM_HASH = "6f458a9ceb9f75b164bb1b700ab3b847bfd71d3df44ecc7f0eff102f2b061079b6d9f563c1a1eb5d13e58f7cd272f9916019722731e15631cdaf84456546e5b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-cosmos \
python310-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg"

inherit rpm
