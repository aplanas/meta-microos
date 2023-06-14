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

RPM_NAME = "python39-azure-storage-file-share-12.12.0-1.2.noarch.rpm"
RPM_HASH = "e758d00db4373f12d6eb4b1ffb788a239d8f5518a8fb406baf3b65c57b87935d02944c2fb76e02c5f0eb99a291a76818266ef10bf0c7112969957b0be00c7e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-file-share \
python39-azure-storage-file-share \
python3dist-azure-storage-file-share"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.0.1 if python39-base < 3.8 \
python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
