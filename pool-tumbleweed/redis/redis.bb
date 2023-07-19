SUMMARY = "Persistent key-value database"
DESCRIPTION = "redis is an advanced key-value store. It is similar to memcached but the dataset \
is not volatile, and values can be strings, exactly like in memcached, \
but also lists, sets, and ordered sets. All this data types can be manipulated \
with atomic operations to push/pop elements, add/remove elements, perform server \
side union, intersection, difference between sets, and so forth. Redis supports \
different kind of sorting abilities."
LICENSE = "BSD-3-Clause"

PV = "7.0.12"

RPM_NAME = "redis-7.0.12-1.1.aarch64.rpm"
RPM_HASH = "5a4ac08dcf661e38025b5c12ddcea1ee937d19b0092d8628f3ab11a4d7b42d7f026e302d5102ba04eea11ee8a1da70128478e2f7408d4507125915e5bfc2a0c9"

RPROVIDES:${PN} += "config-redis \
group-redis \
redis \
user-redis"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
