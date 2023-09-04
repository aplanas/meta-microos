SUMMARY = "Unsupported modules for arm64-efi"
DESCRIPTION = "Unsupported modules for grub2-arm64-efi"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-extras-2.06-55.1.noarch.rpm"
RPM_HASH = "649e100a8b9f110aa94d730285a17765f58bd14941f424d73510aeae6616aff5137eace2472914d0ecc94428dd0364e9c1ae0eabedde18aec93452ccc4c783fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfs.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfscrypt.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfsinfo.mod \
grub2-arm64-efi-extras"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
