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

RPM_NAME = "python311-azure-multiapi-storage-1.1.0-1.1.noarch.rpm"
RPM_HASH = "a788a219a47036eaa9ff7072bbc14e40fab0c5a5713bb693e7416ccb4664e35e74feb29c286a8791a5ec14fc0f6ca6c95f53b6492cf09f62f4d2580f40347b87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-multiapi-storage \
python311-azure-multiapi-storage \
python3dist-azure-multiapi-storage"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-cryptography \
python311-msrest \
python311-python-dateutil \
python311-requests"

inherit rpm
