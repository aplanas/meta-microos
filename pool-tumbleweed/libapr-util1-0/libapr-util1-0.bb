SUMMARY = "Apache Portable Runtime (APR) Utility Library"
DESCRIPTION = "A companion library to APR, the Apache Portable Runtime."
LICENSE = "Apache-2.0"

PV = "1.6.3"

RPM_NAME = "libapr-util1-0-1.6.3-1.2.aarch64.rpm"
RPM_HASH = "04b2712d254224fc05f80f331615269e73968f4fd72523baad2f6d53ad3af18645141c0fafe234fe66fc0f768945e2374645178fad6452db389972fcfe6e86f4"

RPROVIDES:${PN} += "libapr-util1-0 \
libapr-util1-0(aarch-64) \
libaprutil-1.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapr-1.so.0()(64bit) \
libc.so.6(GLIBC_2.25)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libexpat.so.1()(64bit) \
libgdbm.so.6()(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
