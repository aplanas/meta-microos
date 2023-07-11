SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "The GRand Unified Bootloader (GRUB) is a highly configurable and customizable \
bootloader with modular architecture.  It supports rich variety of kernel formats, \
file systems, computer architectures and hardware devices.  This subpackage \
provides support for EFI systems."
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-2.06-53.3.noarch.rpm"
RPM_HASH = "f74884cd9aa6edf76a64790cef8a2e108163d123e2b2dcb92399efb753b6aec4626183526b01a67a28dbf481bcc18bea5772fedb90bcf16153b687ab42a63154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi \
grub2-efi"

RDEPENDS:${PN} += "/usr/bin/sh \
efibootmgr \
grub2"

inherit rpm
