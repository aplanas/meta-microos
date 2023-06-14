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

PV = "12.11.0"

RPM_NAME = "python310-azure-storage-file-datalake-12.11.0-1.1.noarch.rpm"
RPM_HASH = "af4a6739cbab99f444a7f6b9768d7fea23fa7c2d91e128d4ea669e749f151b17fc4d926fac9864e3759096a58c10f93322b5b216adcde105d1ca4da7eb9ac919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file-datalake \
python3.10dist-azure-storage-file-datalake \
python310-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.0.1 if python310-base < 3.8 \
python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-blob \
python310-azure-storage-nspkg \
python310-isodate"

inherit rpm
