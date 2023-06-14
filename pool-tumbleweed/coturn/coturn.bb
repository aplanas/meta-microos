SUMMARY = "TURN and STUN server for VoIP"
DESCRIPTION = "STUN (Session Traversal Utilities for NAT) and TURN (Traversal Using Relays \
around NAT) are protocols that can be used to provide NAT traversal for VoIP \
and WebRTC. \
 \
It can be used as a general-purpose network traffic TURN server and gateway, \
too. On-line management interface (over telnet or over HTTPS) for the TURN \
server is available."
LICENSE = "BSD-3-Clause"

PV = "4.6.2"

RPM_NAME = "coturn-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "6ae8fc19ac10b2f4189e6bf00ca1e7e13a3697c235a3c42faf6c338f3c4cad6a6821c6d284ce50be8f86dfd6f381c16f087584609848708e9a5ff51e652d100e"

RPROVIDES:${PN} += "config-coturn \
coturn \
group-coturn \
user-coturn"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libevent-openssl-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libhiredis.so.1.1.0 \
libmariadb.so.3 \
libpq.so.5 \
libsqlite3.so.0 \
libssl.so.3 \
shadow \
sysuser-shadow"

inherit rpm
