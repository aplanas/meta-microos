SUMMARY = "Library to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow1-20221124-3.13.aarch64.rpm"
RPM_HASH = "dd8a8b430f0b4db0c3f9e2d07f0e2e0c6733a093f09fbe16665739db7a3ec8e48310f658e00d9b15710db94b68e02b5f29a9af575b25fe3feb1f3d2222423215"

RPROVIDES:${PN} += "libqcow.so.1 \
libqcow1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
