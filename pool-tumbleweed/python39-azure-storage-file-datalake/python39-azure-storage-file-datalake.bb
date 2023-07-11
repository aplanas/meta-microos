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

RPM_NAME = "python39-azure-storage-file-datalake-12.11.0-1.3.noarch.rpm"
RPM_HASH = "b111ce13a75a50a57f8e590a66d4fe92302dba6f1b0398111b02e1c4a8c86af362b73ee95a6d6858dec852c19fed3d96efa508a298d3ce569cec7c18dbe8ff6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-file-datalake \
python39-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-blob \
python39-azure-storage-nspkg \
python39-isodate"

inherit rpm
