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

PV = "2.8.1+git0.a90123aa8"

RPM_NAME = "haproxy-2.8.1+git0.a90123aa8-1.1.aarch64.rpm"
RPM_HASH = "6914be25cc7c765f737ad69e8abee7d29ee7f55b99c4d48f81f2131251b7df3c51c91c2cbbbd4cd768282e511306c668c9a265e180b2024b0f6a5f39c7ffc9e5"

RPROVIDES:${PN} += "config-haproxy \
group-haproxy \
haproxy \
haproxy-1.5 \
haproxy-doc \
user-haproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
liblua5.4.so.5 \
libpcre2-8.so.0 \
libssl.so.3 \
libsystemd.so.0 \
libz.so.1 \
sysuser-shadow"

inherit rpm
