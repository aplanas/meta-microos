SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-2.06-54.1.noarch.rpm"
RPM_HASH = "22b2b74512f966e492b50c59d118092e115e7cc48d5accaac7ab4b913148aade4c3614dd27b4c4ba556f62e7c838ada5d34d03bdb6393a69357ddda8c0e70963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi \
grub2-efi"

RDEPENDS:${PN} += "/usr/bin/sh \
efibootmgr \
grub2"

inherit rpm
