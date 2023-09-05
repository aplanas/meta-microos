SUMMARY = "Network boot loader images in bootable USB, CD, floppy and GRUB formats"
DESCRIPTION = "iPXE is a network bootloader. It provides a direct \
replacement for proprietary PXE ROMs, with many extra features such as \
DNS, HTTP, iSCSI, etc. \
 \
This package contains the iPXE boot images in USB, CD, floppy, and PXE \
UNDI formats. EFI is supported, too."
LICENSE = "GPL-2.0-only"

PV = "1.21.1+git20230120.a99e435c"

RPM_NAME = "ipxe-bootimgs-1.21.1+git20230120.a99e435c-3.1.aarch64.rpm"
RPM_HASH = "1a3f6855993cdf042c429a00afd4f3eab394410f03a30e2382a9a1e8976e6bb61f8a9ddaf83084b16c39b4c7b0af10a8d9d9d3cc8cd853dd1b5c058fc316dff3"

RPROVIDES:${PN} += "ipxe-bootimgs"

RDEPENDS:${PN} += ""

inherit rpm
