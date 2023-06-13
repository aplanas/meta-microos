SUMMARY = "An easy to use logging library"
DESCRIPTION = "Liblogging is an easy to use logging library. \
 \
It contains the Libstdlog component is used for standard logging \
(syslog replacement) purposes via multiple channels."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "liblogging0-1.0.6-4.19.aarch64.rpm"
RPM_HASH = "c74b3e4fc6537abba59b0de7b5c8a10d18f303a1f99f496f421eec5d14b03a75b349f87bb0e10e6dced07802b7b998e72844cfd9f0eb1af170669f344b0d06c5"

RPROVIDES:${PN} += "liblogging-rfc3195.so.0()(64bit) \
liblogging-stdlog.so.0()(64bit) \
liblogging0 \
liblogging0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
