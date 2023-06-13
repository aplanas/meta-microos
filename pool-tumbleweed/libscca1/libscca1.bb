SUMMARY = "Library to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca1-20221027-3.7.aarch64.rpm"
RPM_HASH = "a13b10d1e5310d5fb07c82bfa685985d11234f1f7272a2dcf0090cd919e705f3a88ad594d153abdb7125fe1235c80c7471adb41b1ad040aae5533faec2de465a"

RPROVIDES:${PN} += "libscca.so.1()(64bit) \
libscca.so.1(V_20221027)(64bit) \
libscca1 \
libscca1(aarch-64)"

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
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdata.so.1()(64bit) \
libfdata.so.1(V_20230319)(64bit) \
libfvalue.so.1()(64bit) \
libfvalue.so.1(V_20220120)(64bit) \
libfwnt.so.1()(64bit) \
libfwnt.so.1(V_20220922)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
