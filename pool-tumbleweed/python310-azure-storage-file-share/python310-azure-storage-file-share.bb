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

PV = "12.13.0"

RPM_NAME = "python310-azure-storage-file-share-12.13.0-1.2.noarch.rpm"
RPM_HASH = "5416cfd6204fe1b00cef33cf288d7c1e6f9539d74141444ee9823508fe674ef22d3f918928045fd96d5aa0bee18266609fc7b59e113d733b76ccc7348fe68512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-file-share \
python310-azure-storage-file-share \
python3dist-azure-storage-file-share"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 \
python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
