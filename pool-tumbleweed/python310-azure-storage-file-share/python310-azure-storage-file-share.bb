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

RPM_NAME = "python310-azure-storage-file-share-12.12.0-1.2.noarch.rpm"
RPM_HASH = "3ffef3d30143682a120b77cd09a645c3b41093287167b94441dbed7d065a0c6660ae558a12e9b38aa5c60f8c24953c06feacec026b9c15c3e462f75e907d28a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file-share \
python3.10dist(azure-storage-file-share) \
python310-azure-storage-file-share \
python3dist(azure-storage-file-share)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.0.1 if python310-base < 3.8) \
python(abi) \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
