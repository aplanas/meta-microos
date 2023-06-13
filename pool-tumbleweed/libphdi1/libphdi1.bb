SUMMARY = "Library for accessing Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi1-20221025-3.8.aarch64.rpm"
RPM_HASH = "dd3e4eab1fef965b7a356b91cb0b87fc21223db37bb1f747cf1fa651314054f7779cfddd00d4cc99d061ba17f70da5ce5df93f8654cf09abd4b0e8f8404f8a83"

RPROVIDES:${PN} += "libphdi.so.1()(64bit) \
libphdi.so.1(V_20221025)(64bit) \
libphdi1 \
libphdi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcdirectory.so.1()(64bit) \
libcdirectory.so.1(V_20220105)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcpath.so.1()(64bit) \
libcpath.so.1(V_20220108)(64bit) \
libcthreads.so.1()(64bit) \
libcthreads.so.1(V_20220102)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdata.so.1()(64bit) \
libfdata.so.1(V_20230319)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfvalue.so.1()(64bit) \
libfvalue.so.1(V_20220120)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
