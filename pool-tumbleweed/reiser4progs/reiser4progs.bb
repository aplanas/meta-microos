SUMMARY = "Utilities for Managing the Reiser4 File System"
DESCRIPTION = "A set of commands for using the Reiser4 file system, including \
mkfs.reiser4."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "reiser4progs-2.0.5-1.8.aarch64.rpm"
RPM_HASH = "67280042232e8186ccb097ed86f10ca65e7dc33f0cbd85180851193b859566981acf1a77fea3aace24e24b3859fb489ee4920154effd0758d978699838a1daf2"

RPROVIDES:${PN} += "reiser4progs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaal-1.0.so.7 \
libc.so.6 \
libreadline.so.8 \
libreiser4-2.0.so.5 \
librepair-2.0.so.5 \
libuuid.so.1"

inherit rpm
