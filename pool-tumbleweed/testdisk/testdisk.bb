SUMMARY = "Tool to Recover and Fix Partitions"
DESCRIPTION = "TestDisk is a data recovery software primarily designed to help recover lost \
partitions and/or make non-booting disks bootable again."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "testdisk-7.1-4.13.aarch64.rpm"
RPM_HASH = "bd957bf52e51d02877babea245e3d43234a008b145cfcf1c5110ff9008bbd6f4445dc14bafa50d9eca2299c06beeebf1761a60b3d33c86bb51cd6bcab18a6f98"

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
