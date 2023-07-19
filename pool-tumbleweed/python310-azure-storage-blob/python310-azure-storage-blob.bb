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

RPM_NAME = "python310-azure-storage-blob-12.17.0-1.1.noarch.rpm"
RPM_HASH = "76dc891ed5ba32736803e5c92e903af5953d174592a29b6ef4310490c553340a46d0976c046e7d37a240814f56027fded3abdc7e4e59c92ffea976cf999dac1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-blob \
python310-azure-storage-blob \
python3dist-azure-storage-blob"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 \
python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-common \
python310-azure-storage-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
