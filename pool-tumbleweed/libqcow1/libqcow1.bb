SUMMARY = "Library to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow1-20221124-3.14.aarch64.rpm"
RPM_HASH = "8a498ecc13e07e6b33fe2f142eff24484dc286ccd678ab87ad02bd559d8729c1f0db322354ae1e93b806c86dd2a126858e0690153d5c820664cb10d31fc8ff84"

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
