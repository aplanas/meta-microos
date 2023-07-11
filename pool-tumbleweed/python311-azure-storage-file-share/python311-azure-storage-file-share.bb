SUMMARY = "Azure Storage File Share client library for Python"
DESCRIPTION = "Azure File Share storage offers fully managed file shares in the cloud that are accessible via \
the industry standard [Server Message Block (SMB) protocol](https://docs.microsoft.com/windows/ \
desktop/FileIO/microsoft-smb-protocol-and-cifs-protocol-overview). Azure file shares can be mounted \
concurrently by cloud or on-premises deployments of Windows, Linux, and macOS. Additionally, \
Azure file shares can be cached on Windows Servers with Azure File Sync for fast access near \
where the data is being used. \
 \
Azure file shares can be used to: \
 \
 * Replace or supplement on-premises file servers \
 * 'Lift and shift' applications \
 * Simplify cloud development with shared application settings, \
   diagnostic share, and Dev/Test/Debug tools"
LICENSE = "MIT"

PV = "12.12.0"

RPM_NAME = "python311-azure-storage-file-share-12.12.0-1.4.noarch.rpm"
RPM_HASH = "ee269fb709f5544e3c04fb4e8a2d139a8ec862a503bf9226cd3f35c0ee3151ad89330f4148bb99d5b48c4339831b5c3e6eaf70f8d7ff0b137ea38377c5d1cd80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file-share \
python3.11dist-azure-storage-file-share \
python311-azure-storage-file-share \
python3dist-azure-storage-file-share"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
