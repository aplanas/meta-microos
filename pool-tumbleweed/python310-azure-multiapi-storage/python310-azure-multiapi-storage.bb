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

RPM_NAME = "python310-azure-multiapi-storage-1.2.0-1.2.noarch.rpm"
RPM_HASH = "664471f7afbaca1e7bfeaf78df40a29c3cdc8f68387ddd57574918e83f25726be12fabdbd8de453c85f86b5e1af032c8097aa8aeb64776d417d7a176ccba10af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-multiapi-storage \
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
