SUMMARY = "Library to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow1-20221124-3.9.aarch64.rpm"
RPM_HASH = "b1f3d25e0ab00bddf4798c988add58d0f7fb029f2464818dd418f73a2ab416fb1966663cebbb80dd9d6795bfd08c1df1d48b719945465643b7f26919bb9b3f0e"

RPROVIDES:${PN} += "libqcow.so.1()(64bit) \
libqcow.so.1(V_20221124)(64bit) \
libqcow1 \
libqcow1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcaes.so.1()(64bit) \
libcaes.so.1(V_20230406)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcthreads.so.1()(64bit) \
libcthreads.so.1(V_20220102)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdata.so.1()(64bit) \
libfdata.so.1(V_20230319)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit) \
libz.so.1()(64bit)"

inherit rpm
