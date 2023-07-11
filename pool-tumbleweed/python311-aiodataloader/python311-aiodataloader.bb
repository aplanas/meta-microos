SUMMARY = "Asyncio DataLoader implementation for Python"
DESCRIPTION = "A generic utility to be used as part of your application's \
data fetching layer to provide a simplified and consistent API over \
various remote data sources such as databases or web services via \
batching and caching."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-aiodataloader-0.2.1-2.8.noarch.rpm"
RPM_HASH = "299d306852bcf7882dd63dc05ecef1422676dcdb20e50d66cdcf8480511359766a0f5091b7185cf656d784e814f3e9817768d4bb64cb17fb64dcf9af4d73b37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiodataloader \
python3.11dist-aiodataloader \
python311-aiodataloader \
python3dist-aiodataloader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
