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

RPM_NAME = "flashrom-devel-1.2-4.6.aarch64.rpm"
RPM_HASH = "edc83e0c5fdd16f9e508e6aa88fd8135f02a78a97a262d1813c71d5ff95621eaabe904424e738eec92a69d902ddf7b47a17eb03e3a22a3a97320ae6ccf4e85ec"

RPROVIDES:${PN} += "flashrom-devel \
pkgconfig-flashrom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libflashrom1"

inherit rpm
