SUMMARY = "Asyncio DataLoader implementation for Python"
DESCRIPTION = "A generic utility to be used as part of your application's \
data fetching layer to provide a simplified and consistent API over \
various remote data sources such as databases or web services via \
batching and caching."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-aiodataloader-0.2.1-2.6.noarch.rpm"
RPM_HASH = "71c8a2a908093355ee035a5ae8d5f353ba936a863d29c9437ef4ae7454df1725f4b998e565ca95dd5d0368c62ec8006fdd220338f55f3645db6e15f8ccd8e935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiodataloader) \
python39-aiodataloader \
python3dist(aiodataloader)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
