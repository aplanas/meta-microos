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

RPM_NAME = "python310-azure-storage-blob-12.16.0-2.3.noarch.rpm"
RPM_HASH = "03dec5a81c816ed1c38e31a9a2c3837d1819d4021b2529df9a2715ea2d9e5785998ec6e368ddc463dff68854804a67038979d0deba9f2619f542f9d5b7753800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-blob \
python310-azure-storage-blob \
python3dist-azure-storage-blob"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-common \
python310-azure-storage-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
