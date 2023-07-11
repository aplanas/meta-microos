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

RPM_NAME = "python310-azure-core-1.27.1-1.2.noarch.rpm"
RPM_HASH = "4e3f8626fad03777ba47baefee270e72ac9632ce4304ee851918dbf7d2ba22586b5665e6e8329ff7d064dde2ece38950340955699b2ca0431d99d4befa8c4360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-core \
python310-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-azure-nspkg \
python310-requests"

inherit rpm
