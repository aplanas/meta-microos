SUMMARY = "FUSE module to mount CD-ROM images with ISO9660 filesystems in them"
DESCRIPTION = "Fuseiso is a FUSE filesystem module which allows to mount many ISO9660 \
filesystem images (for CD-ROMs) as a non-root user using fuse. \
 \
It supports plain ISO9660 Level 1 and 2, with Rock Ridge, Joliet and \
zisofs extensions and also supports the CD-ROM image types img, bin, \
mdf and nrg."
LICENSE = "GPL-2.0+"

PV = "20070708"

RPM_NAME = "fuseiso-20070708-50.29.aarch64.rpm"
RPM_HASH = "703ad0d07a380c1772efea3316ce0695235401410c737d1be8c17558e17556c5309fb38a715643a7462d33b7595ba39a32887995e7de1af5fb5f1941e1309a40"

RPROVIDES:${PN} += "fuseiso"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libglib-2.0.so.0 \
libz.so.1"

inherit rpm
