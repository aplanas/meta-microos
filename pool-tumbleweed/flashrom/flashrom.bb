SUMMARY = "A universal flash programming utility"
DESCRIPTION = "flashrom is a utility for reading, writing, verifying and erasing flash ROM \
chips. It's often used to flash BIOS/EFI/coreboot/firmware images in-system \
using a supported mainboard, but it also supports flashing of network \
cards (NICs), SATA controller cards, and other external devices which can \
program flash chips. \
 \
It supports a wide range of DIP32, PLCC32, DIP8, SO8/SOIC8, TSOP32, and \
TSOP40 chips, which use various protocols such as LPC, FWH, parallel flash, \
or SPI."
LICENSE = "GPL-2.0-only"

PV = "1.2"

RPM_NAME = "flashrom-1.2-4.6.aarch64.rpm"
RPM_HASH = "d589174e80bdc06e547a1404cc033168d7f25f286f1a323407aa98181fa8b881b97894a40c9ee7757cfe520a183a10be72adce3ec5b4df87a6cfce4bee714a19"

RPROVIDES:${PN} += "flashrom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libusb-1.0.so.0"

inherit rpm
