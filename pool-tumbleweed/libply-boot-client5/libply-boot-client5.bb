SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-boot-client library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-boot-client5-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "27296a7b205165de6c26eeb05b6d11aa8ee97f5047de0080dbcf0c65482d720fd066afa689ae74e55fa6961c4cec2b526e120638cf68976d269f28ed04b02972"

RPROVIDES:${PN} += "libply-boot-client.so.5()(64bit) \
libply-boot-client5 \
libply-boot-client5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libply.so.5()(64bit)"

inherit rpm
