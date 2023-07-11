SUMMARY = "Unsupported modules for arm64-efi"
DESCRIPTION = "Unsupported modules for grub2-arm64-efi"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-extras-2.06-53.3.noarch.rpm"
RPM_HASH = "e4a190caa9a847f0a2187f3b39ecc12b70553df895127cf79bd35745c77960ddb9bb461f064b39213a2edaafa974d185d4435e4deff060888731eca37570e74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfs.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfscrypt.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfsinfo.mod \
grub2-arm64-efi-extras"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
