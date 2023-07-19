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

RPM_NAME = "python311-azure-storage-file-datalake-12.12.0-1.1.noarch.rpm"
RPM_HASH = "f755e75ee6c714ed75d3bf25975decc93d69a05efb2d6bcd9342f7615afc87a439fb3ebaef1a584bfeafb819b2233807318b011bc480912e26cc56c36b3f242a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file-datalake \
python3.11dist-azure-storage-file-datalake \
python311-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 \
python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-blob \
python311-azure-storage-nspkg \
python311-isodate"

inherit rpm
