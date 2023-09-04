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

PV = "1.29.3"

RPM_NAME = "python311-azure-core-1.29.3-1.1.noarch.rpm"
RPM_HASH = "c0f0827abba7a56f2ff83cf05a7240537326c2bd1342447759d927422b9fdb7dd8a8c282d5bfbe37e30d535d6d7dc2af69f06a91c479cf321702a13e247d28cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core \
python3.11dist-azure-core \
python311-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-azure-nspkg \
python311-requests"

inherit rpm
