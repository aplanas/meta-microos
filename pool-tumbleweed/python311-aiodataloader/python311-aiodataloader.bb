SUMMARY = "Asyncio DataLoader implementation for Python"
DESCRIPTION = "A generic utility to be used as part of your application's \
data fetching layer to provide a simplified and consistent API over \
various remote data sources such as databases or web services via \
batching and caching."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-aiodataloader-0.2.1-2.6.noarch.rpm"
RPM_HASH = "5f6f54d4fd5cfb1638eced3ee5242dc8638378f723337966d7b7ae70dbc08aef7eb29574c6d6532e3ebda5126e410db6c7ad0e30f40d90990351cb226a1ebd1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiodataloader \
python311-aiodataloader \
python3dist-aiodataloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
