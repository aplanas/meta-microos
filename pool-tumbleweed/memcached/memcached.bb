SUMMARY = "A high-performance, distributed memory object caching system"
DESCRIPTION = "Memcached is a high-performance, distributed memory object caching \
system, generic in nature, but intended for use in speeding up dynamic \
web applications by alleviating database load."
LICENSE = "BSD-3-Clause"

PV = "1.6.19"

RPM_NAME = "memcached-1.6.19-1.3.aarch64.rpm"
RPM_HASH = "97a1bb9f2fbb519fe21cddf3620afc74b4891865a147d80883ff6696ab69433b30412159ae875c21ddc730c196a83a5be846c203621ff9095571332b43be7b85"

RPROVIDES:${PN} += "group(memcached) \
memcached \
memcached(aarch-64) \
user(memcached)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libevent-2.1.so.7()(64bit) \
libsasl2.so.3()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
sysuser-shadow"

inherit rpm
