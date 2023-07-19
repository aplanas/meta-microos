SUMMARY = "Microsoft Azure Storage Blob Client Library for Python"
DESCRIPTION = "Azure Blob storage is Microsoft's object storage solution for the cloud. Blob storage is optimized \
for storing massive amounts of unstructured data, such as text or binary data. \
 \
Blob storage is ideal for: \
 \
* Serving images or documents directly to a browser \
* Storing files for distributed access \
* Streaming video and audio \
* Storing data for backup and restore, disaster recovery, and archiving \
* Storing data for analysis by an on-premises or Azure-hosted service"
LICENSE = "MIT"

PV = "12.17.0"

RPM_NAME = "python39-azure-storage-blob-12.17.0-1.1.noarch.rpm"
RPM_HASH = "5b254e8a726c2e0ce29badd70e6b7793f8c5cea468daa803d08c5b1868ddc48b927ca3492c30bee4d10573801b3c30f6d6bfdf4d296c5315adf40b432390479d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-blob \
python39-azure-storage-blob \
python3dist-azure-storage-blob"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 \
python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-common \
python39-azure-storage-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
