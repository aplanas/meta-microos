SUMMARY = "A universal flash programming utility"
DESCRIPTION = "flashrom is a utility for reading, writing, verifying and erasing flash ROM \
chips. It's often used to flash BIOS/EFI/coreboot/firmware images in-system \
using a supported mainboard, but it also supports flashing of network \
cards (NICs), SATA controller cards, and other external devices which can \
program flash chips."
LICENSE = "GPL-2.0-only"

PV = "1.2"

RPM_NAME = "libflashrom1-1.2-4.6.aarch64.rpm"
RPM_HASH = "1d3bcb09a5a5b6dd40395198801ea6aeab491d9f1c81520b237d3435f1c5278a26c18cdf3b24073cd45ee60c19cc19d91fdf6a41df641a4e873bbd4538c85192"

RPROVIDES:${PN} += "libflashrom.so.1 \
libflashrom1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libusb-1.0.so.0"

inherit rpm
