SUMMARY = "Unsupported modules for arm64-efi"
DESCRIPTION = "Unsupported modules for grub2-arm64-efi"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-extras-2.06-54.1.noarch.rpm"
RPM_HASH = "5f11f206980655f0bded98d31bf9912a9ca25f43ff46a69d2f387c759b06c6d7949bb7d308c3c2ce330512f3675928c54cc44286ce7a06c5aa4e13b72bee8347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfs.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfscrypt.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfsinfo.mod \
grub2-arm64-efi-extras"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
