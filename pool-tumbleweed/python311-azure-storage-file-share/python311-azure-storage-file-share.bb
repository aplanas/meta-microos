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

RPM_NAME = "python311-azure-storage-file-share-12.12.0-1.2.noarch.rpm"
RPM_HASH = "dad6ebec88f688200776ca8435c3bbb3c5bb94b345961b28c3692399906f80354eba9f22d17b31d72392ac3a9969d2935fca4f455c02407fef299be712f3206f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-storage-file-share) \
python311-azure-storage-file-share \
python3dist(azure-storage-file-share)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.0.1 if python311-base < 3.8) \
python(abi) \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
