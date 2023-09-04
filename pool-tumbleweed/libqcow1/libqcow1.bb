SUMMARY = "Library to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow1-20221124-4.1.aarch64.rpm"
RPM_HASH = "3aa0e5b9b0759e8dd6a63aced26a3860d1aab90a6f1f2790042e16a6a614cdbe8df13d8bff1ae8e53fab29828bca1410e8b4c773829788efa5ddec852c804857"

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
