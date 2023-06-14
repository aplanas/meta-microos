SUMMARY = "Network boot loader images in bootable USB, CD, floppy and GRUB formats"
DESCRIPTION = "iPXE is a network bootloader. It provides a direct \
replacement for proprietary PXE ROMs, with many extra features such as \
DNS, HTTP, iSCSI, etc. \
 \
This package contains the iPXE boot images in USB, CD, floppy, and PXE \
UNDI formats. EFI is supported, too."
LICENSE = "GPL-2.0-only"

PV = "1.21.1+git20230120.a99e435c"

RPM_NAME = "ipxe-bootimgs-1.21.1+git20230120.a99e435c-2.3.aarch64.rpm"
RPM_HASH = "cffabc22a9a305f48b17d48dc442e92ef64c4a09f5607651eeb596d4b972eace0c6afa69d91c2a55906cadd65a8e0f4cd7f7b43a8a877a3bbf90b77cbb331d4a"

RPROVIDES:${PN} += "ipxe-bootimgs"

RDEPENDS:${PN} += ""

inherit rpm
