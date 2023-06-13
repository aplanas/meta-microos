SUMMARY = "Library for accessing the Outlook Nickfile (NK2) format"
DESCRIPTION = "libnk2 is a library to access Outlook's Nickfile (NK2) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-1-20221122-3.3.aarch64.rpm"
RPM_HASH = "3619c8becbba63168f1e6131d494c3893666c146c16550b0790ae857f12d805b1659b7cf6084dffd87f85ab6249ef34099d3448489f560a03d70cf0fd86abc43"

RPROVIDES:${PN} += "libnk2-1 \
libnk2-1(aarch-64) \
libnk2.so.1()(64bit) \
libnk2.so.1(V_20221122)(64bit)"

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
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
