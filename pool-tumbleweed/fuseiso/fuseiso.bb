SUMMARY = "FUSE module to mount CD-ROM images with ISO9660 filesystems in them"
DESCRIPTION = "Fuseiso is a FUSE filesystem module which allows to mount many ISO9660 \
filesystem images (for CD-ROMs) as a non-root user using fuse. \
 \
It supports plain ISO9660 Level 1 and 2, with Rock Ridge, Joliet and \
zisofs extensions and also supports the CD-ROM image types img, bin, \
mdf and nrg."
LICENSE = "GPL-2.0+"

PV = "20070708"

RPM_NAME = "fuseiso-20070708-50.28.aarch64.rpm"
RPM_HASH = "dc47d8136c93360285b2aa785a7f44af280c90f80f0147bbe28bbf27cbfd46334863bd34648f7763e786154de976c844e62cd4c81702bfda1d72177687fca9fc"

RPROVIDES:${PN} += "fuseiso \
fuseiso(aarch-64)"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libglib-2.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
