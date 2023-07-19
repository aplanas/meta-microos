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

RPM_NAME = "python311-azure-storage-file-share-12.13.0-1.2.noarch.rpm"
RPM_HASH = "93a31e65d5dca529a4e8e14c57bb3acb9deb704521118f20129fe24b2c338779e1de4793317188f8a76bb838994eecb688f1cc544b95e0f5575a7f8f2deb6f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file-share \
python3.11dist-azure-storage-file-share \
python311-azure-storage-file-share \
python3dist-azure-storage-file-share"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 \
python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
