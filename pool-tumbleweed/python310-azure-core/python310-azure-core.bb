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

PV = "1.27.0"

RPM_NAME = "python310-azure-core-1.27.0-1.1.noarch.rpm"
RPM_HASH = "0c2a27b3f1dce8e38943942f101748aaf6691547d2ea2e854f877518d13ee74543d6c146c7f41f600b671b53e4c6746eba1517585d65bd1f67caf96e76ed0a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core \
python3.10dist(azure-core) \
python310-azure-core \
python3dist(azure-core)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-aiohttp \
python310-azure-nspkg \
python310-requests"

inherit rpm