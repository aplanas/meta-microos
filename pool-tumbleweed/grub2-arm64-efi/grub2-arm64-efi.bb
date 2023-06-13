SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-2.06-53.1.noarch.rpm"
RPM_HASH = "3eeb6e910a95dbc9e2b5c7b4fdf83945391ff53e2feed6032a8523900c53b4ccde1087591825bd2b8db1020fd34159267c5ad0308e34c391ec0055c2b49edab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi \
grub2-efi"

RDEPENDS:${PN} += "/bin/sh \
efibootmgr \
grub2"

inherit rpm
