SUMMARY = "Network boot loader images in bootable USB, CD, floppy and GRUB formats"
DESCRIPTION = "iPXE is a network bootloader. It provides a direct \
replacement for proprietary PXE ROMs, with many extra features such as \
DNS, HTTP, iSCSI, etc. \
 \
This package contains the iPXE boot images in USB, CD, floppy, and PXE \
UNDI formats. EFI is supported, too."
LICENSE = "GPL-2.0-only"

PV = "1.21.1+git20230120.a99e435c"

RPM_NAME = "ipxe-bootimgs-1.21.1+git20230120.a99e435c-2.4.aarch64.rpm"
RPM_HASH = "989c393fc7b7b1a2797ae1ee574499a185ea05d768a5612a0658a2400debe1c6f57330775fbb0fcf59b88e7b4685dfbc2f6a3ab4735da33af52715e2d0c7b052"

RPROVIDES:${PN} += "ipxe-bootimgs"

RDEPENDS:${PN} += ""

inherit rpm
