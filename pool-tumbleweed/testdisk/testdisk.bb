SUMMARY = "Tool to Recover and Fix Partitions"
DESCRIPTION = "TestDisk is a data recovery software primarily designed to help recover lost \
partitions and/or make non-booting disks bootable again."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "testdisk-7.1-4.15.aarch64.rpm"
RPM_HASH = "bd87fa2682fbdf28c4015fa77e5aa11d013c42d90b30cdb2cddfb9a8442e695ffe78a1497007516e23b2244cf24a87e5ca28a2785f0625f0641eb57ba3a1ca36"

RPROVIDES:${PN} += "testdisk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libewf.so.3 \
libext2fs.so.2 \
libncursesw.so.6 \
libntfs-3g.so.89 \
libtinfo.so.6 \
libuuid.so.1"

inherit rpm
