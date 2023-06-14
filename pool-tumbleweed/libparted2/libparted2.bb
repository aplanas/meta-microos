SUMMARY = "Library for manipulating partitions"
DESCRIPTION = "Libparted is a library for creating, destroying, resizing, checking \
and copying partitions and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "libparted2-3.5-4.4.aarch64.rpm"
RPM_HASH = "81eb559fea63940bcf56c8d3277b3ec52ae623283235a758936a8cf26a27d50449a99da6440382f188f1401fb11e1f0d148dc52b7121e86df3c8aefd600bf822"

RPROVIDES:${PN} += "libparted.so.2 \
libparted2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libuuid.so.1"

inherit rpm
