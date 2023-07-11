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

RPM_NAME = "python39-azure-storage-file-share-12.12.0-1.4.noarch.rpm"
RPM_HASH = "6df3c165a0671ebe7aca3527df0f30856b66ba3c6f77113083ec84f2be634408a63f2031e6dbc21b140323d786dd60aca3971b9f4162049d12aac3a5b1f5583b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-file-share \
python39-azure-storage-file-share \
python3dist-azure-storage-file-share"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
