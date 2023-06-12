SUMMARY = "A universal flash programming utility"
DESCRIPTION = "flashrom is a utility for reading, writing, verifying and erasing flash ROM \
chips. It's often used to flash BIOS/EFI/coreboot/firmware images in-system \
using a supported mainboard, but it also supports flashing of network \
cards (NICs), SATA controller cards, and other external devices which can \
program flash chips. \
 \
This package contains the headers needed to compile against libflashrom."
LICENSE = "GPL-2.0-only"

PV = "1.2"

RPM_NAME = "flashrom-devel-1.2-4.5.aarch64.rpm"
RPM_HASH = "3839ecdf93a9c157a2c432394d376f410c971f029522dfb3e2829c240beb9b2b550fb641f86a0f41013199d5adfcb57b4cc39f067e94632ddf20634414a1ae30"

RPROVIDES:${PN} += "flashrom-devel \
flashrom-devel(aarch-64) \
pkgconfig(flashrom)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libflashrom1"

inherit rpm
