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

PV = "12.16.0"

RPM_NAME = "python310-azure-storage-blob-12.16.0-2.1.noarch.rpm"
RPM_HASH = "e034ba60b01acafdea959738f769e1297ccbd32aa08102a416a6ab5c6cf5e50ef672826a0d2360d90c8dcbc772a726e41f2056340d9d37e024771a8a59841f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-blob \
python3.10dist(azure-storage-blob) \
python310-azure-storage-blob \
python3dist(azure-storage-blob)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.0.1 if python310-base < 3.11) \
python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-common \
python310-azure-storage-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
