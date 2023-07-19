SUMMARY = "Azure DataLake service client library for Python"
DESCRIPTION = "This preview package for Python includes ADLS Gen2 specific API support made \
available in Storage SDK. \
 \
This includes: \
 \
1. New directory level operations (Create, Rename, Delete) for hierarchical namespace \
   enabled (HNS) storage account. For HNS enabled accounts, the rename/move operations \
   are atomic. \
2. Permission related operations (Get/Set ACLs) for hierarchical namespace enabled \
   (HNS) accounts."
LICENSE = "MIT"

PV = "12.12.0"

RPM_NAME = "python310-azure-storage-file-datalake-12.12.0-1.1.noarch.rpm"
RPM_HASH = "fee5ace07f13e491f502e129e06fb996eabd2f03b82f06f69e7e0730ab7072da45bb11f5ec5ceecf087e0a63e4016f757a4fd25753e00a95ee92c1625215db99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-file-datalake \
python310-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 \
python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-blob \
python310-azure-storage-nspkg \
python310-isodate"

inherit rpm
