SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230427"

RPM_NAME = "libfsntfs1-20230427-1.1.aarch64.rpm"
RPM_HASH = "902b2f02b27b8b70d93e82fba5aef38af6d357dca4a479e2dc63717915e80d063447dd87a28f26bc1adbe7071ee09987e93ef0d65f80a78500c8561183d10db9"

RPROVIDES:${PN} += "libfsntfs.so.1()(64bit) \
libfsntfs.so.1(V_20230427)(64bit) \
libfsntfs1 \
libfsntfs1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
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
libfwnt.so.1()(64bit) \
libfwnt.so.1(V_20220922)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
