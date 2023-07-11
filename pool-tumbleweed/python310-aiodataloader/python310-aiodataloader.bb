SUMMARY = "Asyncio DataLoader implementation for Python"
DESCRIPTION = "A generic utility to be used as part of your application's \
data fetching layer to provide a simplified and consistent API over \
various remote data sources such as databases or web services via \
batching and caching."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-aiodataloader-0.2.1-2.8.noarch.rpm"
RPM_HASH = "f06350262f3ade5731a71437b89f8818d82032aae0a45338d5cda548bda4ea68e02a2616b6cc3f3f1f2f785c3ab397a6bf841cce05b31faab2b80a4127ac5d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiodataloader \
python310-aiodataloader \
python3dist-aiodataloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
