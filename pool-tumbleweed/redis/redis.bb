SUMMARY = "Persistent key-value database"
DESCRIPTION = "redis is an advanced key-value store. It is similar to memcached but the dataset \
is not volatile, and values can be strings, exactly like in memcached, \
but also lists, sets, and ordered sets. All this data types can be manipulated \
with atomic operations to push/pop elements, add/remove elements, perform server \
side union, intersection, difference between sets, and so forth. Redis supports \
different kind of sorting abilities."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "redis-7.0.11-2.2.aarch64.rpm"
RPM_HASH = "7ded6b9b63e262530d43197936c76c91f227a626bfe53e6f288238358c43aefb701790089b085f62933f23e8d2e3bd93d3094d17a4fa164caf205b103a223b2b"

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
