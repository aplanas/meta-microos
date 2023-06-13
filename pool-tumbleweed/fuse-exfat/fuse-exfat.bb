SUMMARY = "exFAT file system implementation"
DESCRIPTION = "This driver is an exFAT file system implementation with write \
support. exFAT is a simple file system created by Microsoft. It is \
intended to replace FAT32, removing some of its limitations. exFAT is \
a standard FS for SDXC memory cards."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "fuse-exfat-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "5113c633cc4222d00e3d08ded96feee51da0324aafa9cea9dc220c730cf23f8c19cb5a478d3f3a98098aa5d99db6b82a679610880430b1870b53970b518dfc1d"

RPROVIDES:${PN} += "fuse-exfat \
fuse-exfat(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
fuse \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuse.so.2()(64bit)"

inherit rpm
