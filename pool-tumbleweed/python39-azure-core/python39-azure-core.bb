SUMMARY = "Microsoft Azure Core Library for Python"
DESCRIPTION = "The Azure Core pipeline is a re-structuring of the msrest pipeline introduced in msrest 0.6.0. \
Further discussions on the msrest implementation can be found in the msrest wiki. \
 \
The Azure Core Pipeline is an implementation of chained policies as described in the \
Azure SDK guidelines. \
 \
The Python implementation of the pipeline has some mechanisms specific to Python. \
This is due to the fact that both synchronous and asynchronous implementations of the \
pipeline must be supported independently."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python39-azure-core-1.28.0-1.1.noarch.rpm"
RPM_HASH = "6282d3af605951a861db0ea34a063720b855ca9b9ee5ef6f5922a9809666b08e26c33867647aecc1965a79bdfa2b53e4013935e098def3e03cb5c8ea91e45e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-core \
python39-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-azure-nspkg \
python39-requests"

inherit rpm
