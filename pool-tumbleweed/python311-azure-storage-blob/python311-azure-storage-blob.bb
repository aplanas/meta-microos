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

RPM_NAME = "python311-azure-storage-blob-12.16.0-2.1.noarch.rpm"
RPM_HASH = "833fbee5aa24c944546a34960a8541fa1901b4de45c4d100c66e6b0350aa795fa5d3d47668ec78ec8834c71c47e3c0f7336fcb2c21e1b395a761dea46c11aaf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-storage-blob) \
python311-azure-storage-blob \
python3dist(azure-storage-blob)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.0.1 if python311-base < 3.11) \
python(abi) \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-common \
python311-azure-storage-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
