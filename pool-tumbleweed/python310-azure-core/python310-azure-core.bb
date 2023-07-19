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

RPM_NAME = "python310-azure-core-1.28.0-1.1.noarch.rpm"
RPM_HASH = "0833ba6b864415a8346dea9b3e3db827ec1563c1f85920b62e7ce46462ee5f292b69c715ddac3607e8b91664f0de038653df7be8f82c8ee7733d0421b2848d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-core \
python310-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-azure-nspkg \
python310-requests"

inherit rpm
