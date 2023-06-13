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

RPM_NAME = "erofs-utils-1.6-1.1.aarch64.rpm"
RPM_HASH = "a87486dd12f05ea5a588b66339ab72556f3d806848f8032dbc0bb491512d627943c05a9b07657a131b3bfc11c029f5b8b727f5c0e7ddd4e193f6b383d09475dc"

RPROVIDES:${PN} += "erofs-utils \
erofs-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblz4.so.1()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
