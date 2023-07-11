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

PV = "1.27.1"

RPM_NAME = "python311-azure-core-1.27.1-1.2.noarch.rpm"
RPM_HASH = "9540451ee3b3008d02685d358cc6848afe24908dcaf2f35192a98e20c30acee8dd708dedad19adf6013469561a5410a29f920b1ac126c587aaba820751adbc51"
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
