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

RPM_NAME = "python311-azure-core-1.28.0-1.1.noarch.rpm"
RPM_HASH = "f839e16f971415ecda37130ebc508b5a8ff2394a180bfcf7f7981d40724f93230f2a8b40acfbdabcff8d3f1dc33f02d4d5fc288d15fa6b39905710a6414c4f8f"
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
