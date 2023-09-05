SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-arm64-efi-2.12~rc1-1.1.noarch.rpm"
RPM_HASH = "da601e5251706fd7b442961f0678e7b8ff31063225641a2c2dbd01b55d99d719aec475ee65e54844dceb6d77e467f0a9433d5389beab41f0ebfa6491f8df49a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi \
grub2-efi"

RDEPENDS:${PN} += "/usr/bin/sh \
efibootmgr \
grub2"

inherit rpm
