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

RPM_NAME = "flashrom-1.2-4.5.aarch64.rpm"
RPM_HASH = "951ae96d5c770367fc577d3f74eac1959b9ac324e1e79df9c4c39163ee6fc9f13a87710799ae60635c03b79b0a849d138e04832c33e011f91e678a79e7320547"

RPROVIDES:${PN} += "flashrom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libusb-1.0.so.0"

inherit rpm
