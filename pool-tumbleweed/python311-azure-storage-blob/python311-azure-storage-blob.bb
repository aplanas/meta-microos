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

RPM_NAME = "python311-azure-storage-blob-12.16.0-2.3.noarch.rpm"
RPM_HASH = "eb4a2101963c31dbc56304433f260a74faaf54dbdb462faba180026a7a702365bc08b3c446182df527dafdbeeb7ab8bdef4fc60da465440aade10faef212e152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-blob \
python3.11dist-azure-storage-blob \
python311-azure-storage-blob \
python3dist-azure-storage-blob"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-common \
python311-azure-storage-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
