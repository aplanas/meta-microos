SUMMARY = "Asyncio DataLoader implementation for Python"
DESCRIPTION = "A generic utility to be used as part of your application's \
data fetching layer to provide a simplified and consistent API over \
various remote data sources such as databases or web services via \
batching and caching."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-aiodataloader-0.2.1-2.6.noarch.rpm"
RPM_HASH = "9989d2419d168d3361c9c91d573cd2fca6943136d66762072c96f7cf65a500d6f5872f4fb04b0134d29da8ee4d027a602df57c24bbf3def9313d539859dbac57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiodataloader \
python3.10dist-aiodataloader \
python310-aiodataloader \
python3dist-aiodataloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
