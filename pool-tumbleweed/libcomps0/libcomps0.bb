SUMMARY = "Libraries for libcomps"
DESCRIPTION = "Libraries for libcomps"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "libcomps0-0.1.19-2.3.aarch64.rpm"
RPM_HASH = "08eaac507256360a54a8521ee6e4e673d0bab9a3560802ecd85bd544fda884253ffdf8c466c291b6351de6bc76a87c4280fcb9a8cba1c273a44de0d21a2b0800"

RPROVIDES:${PN} += "libcomps.so.0()(64bit) \
libcomps0 \
libcomps0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexpat.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.23)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit)"

inherit rpm
