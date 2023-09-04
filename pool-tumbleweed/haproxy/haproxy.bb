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

PV = "2.8.2+git0.61a0f576a"

RPM_NAME = "haproxy-2.8.2+git0.61a0f576a-3.1.aarch64.rpm"
RPM_HASH = "5bb0407fa7173fbdab1d814993bc7bc6d39dbd1ee0502684c3a4ae0c13744d58f1b90b93efd828e96040d5c18264c2189f2d1b8967cc3c50f1cdde668a19ae80"

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
