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

RPM_NAME = "python39-azure-core-1.29.3-1.1.noarch.rpm"
RPM_HASH = "488df79898beafa4b9668d10c84ab8b1c653a7bfcee6e0b13afcc7466d795acd73b7ac7a6b3db4fccaa17b5b71073e3c5a12563e1e063f0f684c60762e70b8d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-core \
python39-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-azure-nspkg \
python39-requests"

inherit rpm
