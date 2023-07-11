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

RPM_NAME = "python310-azure-storage-file-datalake-12.11.0-1.3.noarch.rpm"
RPM_HASH = "6904e5a53aaa95ea3cb0e8fe69072b3dea21827cf14bb4112236f34f179b672081489e94f39fb22f7f8d710b16b1593dd12e5403c30d0f6fe57ca53ffa999e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-file-datalake \
python310-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-blob \
python310-azure-storage-nspkg \
python310-isodate"

inherit rpm
