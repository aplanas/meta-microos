SUMMARY = "Persistent key-value database"
DESCRIPTION = "redis is an advanced key-value store. It is similar to memcached but the dataset \
is not volatile, and values can be strings, exactly like in memcached, \
but also lists, sets, and ordered sets. All this data types can be manipulated \
with atomic operations to push/pop elements, add/remove elements, perform server \
side union, intersection, difference between sets, and so forth. Redis supports \
different kind of sorting abilities."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "redis-7.0.11-2.1.aarch64.rpm"
RPM_HASH = "7e57a96e092f8305f09348da09ba1bf10ce789f0a1c951aadeac17564c3facf5673b2161da681629bfbcac73e8624eb7f97dbf505e50274141304f1e8e9fbcb5"

RPROVIDES:${PN} += "config(redis) \
group(redis) \
redis \
redis(aarch-64) \
user(redis)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libm.so.6()(64bit) \
libssl.so.3()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
sysuser-shadow"

inherit rpm
