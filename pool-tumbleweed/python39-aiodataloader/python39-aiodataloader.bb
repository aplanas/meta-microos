SUMMARY = "Asyncio DataLoader implementation for Python"
DESCRIPTION = "A generic utility to be used as part of your application's \
data fetching layer to provide a simplified and consistent API over \
various remote data sources such as databases or web services via \
batching and caching."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-aiodataloader-0.2.1-2.8.noarch.rpm"
RPM_HASH = "da07c8a1438ec3fc56a4cd27c1d6d491e75f31b33c52ee0c353388035ef9a46c97a0c451440165258d742162fd58c283aa9f63025faecf5d7d2631e382123a43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiodataloader \
python39-aiodataloader \
python3dist-aiodataloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
