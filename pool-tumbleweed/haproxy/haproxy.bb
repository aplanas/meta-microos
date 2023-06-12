SUMMARY = "The Reliable, High Performance TCP/HTTP Load Balancer"
DESCRIPTION = "HAProxy implements an event-driven, mono-process model which enables support \
for very high number of simultaneous connections at very high speeds. \
Multi-process or multi-threaded models can rarely cope with thousands of \
connections because of memory limits, system scheduler limits, and lock \
contention everywhere. Event-driven models do not have these problems because \
implementing all the tasks in user-space allows a finer resource and time \
management. The down side is that those programs generally don't scale well on \
multi-processor systems. That's the reason why they must be optimized to get \
the most work done from every CPU cycle."
LICENSE = "GPL-3.0+ & LGPL-2.1+"

PV = "2.8.0+git0.fdd8154ed"

RPM_NAME = "haproxy-2.8.0+git0.fdd8154ed-1.1.aarch64.rpm"
RPM_HASH = "81b91d5bc734224d998c0c5acc0fcd6c0ae1fe4f514154f7abd3300a616dd3d4bac4ee93467035f0839f493dc94338dd5e76a7f9a9d8afb5b31daaa77b2ab93c"

RPROVIDES:${PN} += "config(haproxy) \
group(haproxy) \
haproxy \
haproxy(aarch-64) \
haproxy-1.5 \
haproxy-doc \
user(haproxy)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
liblua5.4.so.5()(64bit) \
libpcre2-8.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libz.so.1()(64bit) \
sysuser-shadow"

inherit rpm
