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

RPM_NAME = "python311-azure-core-1.27.0-1.1.noarch.rpm"
RPM_HASH = "49d995cd9a0eebc057a877823e6c110134e2df903671aa17a12fc3afecbb1904f4b49381818c3c79fd620e4e075f42332eea8197d1f011c1cb196f65be48185b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-core) \
python311-azure-core \
python3dist(azure-core)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-aiohttp \
python311-azure-nspkg \
python311-requests"

inherit rpm
