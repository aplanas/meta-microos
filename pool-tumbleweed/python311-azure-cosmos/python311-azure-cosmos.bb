SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python311-azure-cosmos-4.5.0-1.1.noarch.rpm"
RPM_HASH = "b5791b275c7e720d4ce9c1f72546ccfb33e8a9f3ff3c0c04fe98306dc4ba1240aea532b14c252f2078ee12059123d1bd9c60133a121cbc93ab7f50da47b4d5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cosmos \
python3.11dist-azure-cosmos \
python311-azure-cosmos \
python3dist-azure-cosmos"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg"

inherit rpm
