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

RPM_NAME = "python311-azure-storage-blob-12.17.0-1.1.noarch.rpm"
RPM_HASH = "0868eec9cee5df1e8ed5a7ea02e62c33195b4a599224b49efc875cb9cce8e31a26894cd681c8a0c33f39f03056592604dee77f0d23b9c5de90a532dc9e3c4c7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-blob \
python3.11dist-azure-storage-blob \
python311-azure-storage-blob \
python3dist-azure-storage-blob"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 \
python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-common \
python311-azure-storage-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
