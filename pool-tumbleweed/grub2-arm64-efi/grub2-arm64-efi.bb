SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-arm64-efi-2.12~rc1-2.1.noarch.rpm"
RPM_HASH = "c274e4a56ea1347391fe955c5fbf2730c4f26f0a33fc37b1800b5ba01568fb54d5bc1164002027241bce0d87a91cdb39fcafbf5ef5d2eabcc95094b7216f4b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi \
grub2-efi"

RDEPENDS:${PN} += "/usr/bin/sh \
efibootmgr \
grub2"

inherit rpm
