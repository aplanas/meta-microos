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

RPM_NAME = "python39-azure-storage-file-datalake-12.12.0-1.1.noarch.rpm"
RPM_HASH = "89eb20745b7fdaa9b3ae171be261dcbe4707efb1114607728cda37a5f13cb14f66f705c256d5e502eb2f0fef37a38eba6148c4c4589be122b6f7e05cbde607b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-file-datalake \
python39-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 \
python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-blob \
python39-azure-storage-nspkg \
python39-isodate"

inherit rpm
