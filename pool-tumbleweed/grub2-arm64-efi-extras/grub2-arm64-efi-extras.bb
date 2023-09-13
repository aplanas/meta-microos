SUMMARY = "Unsupported modules for arm64-efi"
DESCRIPTION = "Unsupported modules for grub2-arm64-efi"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-arm64-efi-extras-2.12~rc1-2.1.noarch.rpm"
RPM_HASH = "d24e897455ddaf04d5a93f02c81bbf854ad5a1613614f4bc72958e6f7a8509d77401457f5992c4057adb5cc9fdd6e1d437216468da732c89233dea40e3878f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfs.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfscrypt.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfsinfo.mod \
grub2-arm64-efi-extras"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
