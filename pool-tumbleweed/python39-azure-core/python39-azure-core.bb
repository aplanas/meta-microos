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

RPM_NAME = "python39-azure-core-1.27.1-1.2.noarch.rpm"
RPM_HASH = "d1bc1423e0a6a3788e103fc6876e1775bf98de043bec4dfee33c322a5fb53725f6715ff306678f22df6074046f579a609e345bc0c23875289de023b58667608d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-core \
python39-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-azure-nspkg \
python39-requests"

inherit rpm
