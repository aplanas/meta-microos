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

PV = "1.1.0"

RPM_NAME = "python310-azure-multiapi-storage-1.1.0-1.1.noarch.rpm"
RPM_HASH = "ad9c298683105b364f67393511d8a642ac3695d9f1d4da28317cc30d641538cb3215a4f9d4dfde7c2b80fc161dcf9dd62f1566cff8b2a2d3e83acccee9660cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-multiapi-storage \
python3.10dist-azure-multiapi-storage \
python310-azure-multiapi-storage \
python3dist-azure-multiapi-storage"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-cryptography \
python310-msrest \
python310-python-dateutil \
python310-requests"

inherit rpm
