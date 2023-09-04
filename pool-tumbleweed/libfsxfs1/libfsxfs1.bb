SUMMARY = "Library for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsxfs1-20220829-4.1.aarch64.rpm"
RPM_HASH = "2cbff26072103f0071e1508a8ea64b130168808f9954861258e86f206afc1adb0994d24f075ccb1d1fb31e42066587a2c4baa267e2ce979d11b12630464b80ea"

RPROVIDES:${PN} += "libfsxfs.so.1 \
libfsxfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
