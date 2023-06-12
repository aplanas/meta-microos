SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "libfwsi1-20230114-1.4.aarch64.rpm"
RPM_HASH = "554b516e0130338404f94b3b54c2be2f54bab481930d6b349b9c5cfa816a1416214dc8daab39e2ca88c2abdb3c715a0c70a995c123dc6847a540aa03049bf8c5"

RPROVIDES:${PN} += "libfwsi.so.1()(64bit) \
libfwsi.so.1(V_20230114)(64bit) \
libfwsi1 \
libfwsi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
