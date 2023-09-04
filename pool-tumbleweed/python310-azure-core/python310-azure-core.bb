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

RPM_NAME = "python310-azure-core-1.29.3-1.1.noarch.rpm"
RPM_HASH = "3cd86c39ac10a31f506c941b85e5bfdd197b648ec6891a0a5dd5948d4f63072583f4e89f355568c63ec83826ca8012a9fa1f8ce67dc4664ecfc08a8c7c6bfc3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-core \
python310-azure-core \
python3dist-azure-core"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-azure-nspkg \
python310-requests"

inherit rpm
