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

RPM_NAME = "python311-azure-storage-file-datalake-12.11.0-1.3.noarch.rpm"
RPM_HASH = "cb0aefbeb7ad73e7edfa080d1a6eff85865ae7b1186d97bccc912364dd0537aba3917dfe87737c28ca2a05f59f83b2fce14bd4a0bb6408655adad2182e8778e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file-datalake \
python3.11dist-azure-storage-file-datalake \
python311-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-blob \
python311-azure-storage-nspkg \
python311-isodate"

inherit rpm
