SUMMARY = "Library for accessing the GUID partition table format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "libvsapm1-20210626-4.7.aarch64.rpm"
RPM_HASH = "8335ca263f8925a251f16ae11e010be06641ed9fa109bd9bd90ac8ed0c6d934cecf7b65ee5ae3f46a56547fe94c70d7bd5308460b273b45bf1cfad15952fc830"

RPROVIDES:${PN} += "libvsapm.so.1()(64bit) \
libvsapm.so.1(V_20210626)(64bit) \
libvsapm1 \
libvsapm1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
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
libfdata.so.1(V_20230319)(64bit)"

inherit rpm
