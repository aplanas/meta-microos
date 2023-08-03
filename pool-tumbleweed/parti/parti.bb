SUMMARY = "Show partition table information"
DESCRIPTION = "Show partition table information for \
* Master Boot Record (MBR) Partition Table \
* GUID Partition Table (GPT) \
* Apple Partition Map \
* El Torito Bootable CD/DVD \
* zIPL boot info \
 \
It shows the complete information but mostly in uninterpreted form (unlike partitioning tools like fdisk or parted). \
 \
So it can be used to verify the data your favorite partitioning tool has actually written."
LICENSE = "GPL-3.0"

PV = "2.5"

RPM_NAME = "parti-2.5-1.1.aarch64.rpm"
RPM_HASH = "9948afcc07642dd73fa9eafd3eec0351ead1cc4030b99fad1715dc04ba91b7a33e5be0e701074105313012f41057f10acc835fd35518a1a37ed87d6b118f3798"

RPROVIDES:${PN} += "parti"

RDEPENDS:${PN} += "libblkid.so.1 \
libc.so.6 \
libjson-c.so.5 \
libmediacheck.so.6 \
libuuid.so.1 \
mkisofs"

inherit rpm
