SUMMARY = "MS Azure Storage Client Library for Python - with Multi API version Support"
DESCRIPTION = "Microsoft Azure Storage Client Library for Python - with Multi API version Support \
 \
Handles multi-API versions of Azure Storage Data Plane originally from https://github.com/Azure/azure-storage-python. \
 \
**NOTE:** \
 \
- This is not an official Azure Storage SDK. \
 \
- It is used by https://github.com/Azure/azure-cli to support multiple API versions. \
 \
- The official Azure Storage SDK is at https://github.com/Azure/azure-storage-python."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-multiapi-storage-1.2.0-1.2.noarch.rpm"
RPM_HASH = "5e48f9919a342f2ede45e552305865e0ccd7ee7219d25f2be45d2d567879f60eb3524bb6831c07764608701936ad27c9fd12931abc789cfe48d7803843eaa9d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-multiapi-storage \
python39-azure-multiapi-storage \
python3dist-azure-multiapi-storage"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-cryptography \
python39-msrest \
python39-python-dateutil \
python39-requests"

inherit rpm
