SUMMARY = "A high-performance, distributed memory object caching system"
DESCRIPTION = "Memcached is a high-performance, distributed memory object caching \
system, generic in nature, but intended for use in speeding up dynamic \
web applications by alleviating database load."
LICENSE = "BSD-3-Clause"

PV = "1.6.21"

RPM_NAME = "memcached-1.6.21-1.1.aarch64.rpm"
RPM_HASH = "2f39117d706e7b832e05b9140ae16a06e1ed3f63859dca5f07e42699c0825a5a648d6c71b2574c994bbc4ba9764c241093df6b1eac9b909ee7a1a250199e72e9"

RPROVIDES:${PN} += "group-memcached \
memcached \
user-memcached"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libsasl2.so.3 \
libssl.so.3 \
sysuser-shadow"

inherit rpm
