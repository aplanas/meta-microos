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

RPM_NAME = "python39-azure-storage-blob-12.16.0-2.1.noarch.rpm"
RPM_HASH = "fd5c6eaae15b8a3bacf5b78167e9cc6ff172617ca70d393c5af75aec05f8ee9d511c95b657bf11ed6b641860465b4ca994ecfb8331037f2570d3f30a197bbbba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-storage-blob) \
python39-azure-storage-blob \
python3dist(azure-storage-blob)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.0.1 if python39-base < 3.11) \
python(abi) \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-common \
python39-azure-storage-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
