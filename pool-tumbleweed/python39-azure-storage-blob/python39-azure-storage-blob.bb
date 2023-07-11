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

RPM_NAME = "python39-azure-storage-blob-12.16.0-2.3.noarch.rpm"
RPM_HASH = "7178c106baf38fd684c0299e88a0313053490b9ee717c2047b773717324c5de270336cb9f76aec9ec8ff04d5cb86f9ad219a6361a669dae1e3aff847be9ff68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-blob \
python39-azure-storage-blob \
python3dist-azure-storage-blob"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-common \
python39-azure-storage-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
