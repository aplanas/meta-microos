SUMMARY = "Utilities for the Extendable Read-Only Filesystem (EROFS)"
DESCRIPTION = "mkfs.erofs is a user-space tool to create erofs filesystem images. It \
can create two main types of erofs images, compressed and \
uncompressed: \
 \
 * For compressed images, it is able to integrate several compression \
   algorithms, LZ4 is supported according to the current erofs kernel \
   implementation. \
 * For uncompressed images, it can decide whether the last page of a \
   file should be inlined or not properly."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "erofs-utils-1.6-1.2.aarch64.rpm"
RPM_HASH = "a3262496121b89abe06d966228dddc6a6740a0cd1aa60f71496c94ac20094ac2a9a716d9832de244e3e23c551bd07e6ea2425a508b1ff5110693e52a93dd2e13"

RPROVIDES:${PN} += "erofs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libuuid.so.1"

inherit rpm
