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

RPM_NAME = "python311-azure-multiapi-storage-1.2.0-1.2.noarch.rpm"
RPM_HASH = "0dd11b6051bd4b542c749d38596fe4bd3cb15cd95f3f6667cf1bdfd72ea8a939ecfb85e61cb04cc33d3821dfd05ec94c5efa1da2ad3849adc06f922b5b69e88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-multiapi-storage \
python3.11dist-azure-multiapi-storage \
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
