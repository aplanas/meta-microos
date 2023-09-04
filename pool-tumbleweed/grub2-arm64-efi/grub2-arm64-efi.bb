SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-2.06-55.1.noarch.rpm"
RPM_HASH = "6fdccdca1683b6a7a23b2cc328f76842940f6522a732fb3515bb8d660c9eb73d282ef3b8becace74d2b6c4c7aea4f016b85aed88b6656c32c76d273ecd39f943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi \
grub2-efi"

RDEPENDS:${PN} += "/usr/bin/sh \
efibootmgr \
grub2"

inherit rpm
