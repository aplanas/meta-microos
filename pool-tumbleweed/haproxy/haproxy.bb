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

PV = "2.8.3+git0.86e043add"

RPM_NAME = "haproxy-2.8.3+git0.86e043add-1.1.aarch64.rpm"
RPM_HASH = "b2e470e1340ce268fdf12f2e0d6831cd879b6749f48c74f2fef4010ca931ef3d25ef0a56c76256a253899a710868510352f305a5a43f6d551b3348c09c2fba19"

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
