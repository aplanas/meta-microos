SUMMARY = "NTFS Utilities"
DESCRIPTION = "The ntfsprogs includes utilities for doing all required tasks to NTFS \
partitions. In general, just run a utility without any command line \
options to display the version number and usage syntax."
LICENSE = "GPL-2.0-or-later"

PV = "2022.10.3"

RPM_NAME = "ntfsprogs-2022.10.3-2.3.aarch64.rpm"
RPM_HASH = "640a01748cd20faad867170ee7874f446bc7b80b6c8ea57f8a4329de0055ee680d558f728105792c47dc517eb7462e5eefb96ed6d32adb693b5375ca09736159"

RPROVIDES:${PN} += "ntfsprogs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libntfs-3g.so.89 \
libuuid.so.1"

inherit rpm
