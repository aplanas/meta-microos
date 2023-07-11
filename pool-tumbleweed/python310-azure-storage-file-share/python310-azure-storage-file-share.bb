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

RPM_NAME = "python310-azure-storage-file-share-12.12.0-1.4.noarch.rpm"
RPM_HASH = "10633ed1cc7735a74da02ba38fa07c98b70b9e6f795dc816bb10e5d67bb7ed787b74328c1528896843baa011f67a546ae316a6e61e4dc3e1f9b51d21a36056e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-file-share \
python310-azure-storage-file-share \
python3dist-azure-storage-file-share"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
