SUMMARY = "Chewing libraries"
DESCRIPTION = "This package contains libraries for Chewing, an intelligent phonetic \
input method library for traditional Chinese."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "libchewing3-0.5.1+git20200627.452f622-1.9.aarch64.rpm"
RPM_HASH = "804efbff6465a286981655720d52aac607d677312de126fb637fee1c6eef7e0d3f558117750c23ee7ee29c3f78eacc27bee46f91cf785b03d4f6ea4258a453bc"

RPROVIDES:${PN} += "libchewing.so.3()(64bit) \
libchewing3 \
libchewing3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
chewing-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
