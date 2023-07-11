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

RPM_NAME = "coturn-4.6.2-1.3.aarch64.rpm"
RPM_HASH = "519f0c918686c0d748d0dc01ba3d4f4600fe2e227e3b6fc13149a36b3cbb1eadd9752535cfed7cb9fdbbd968508b5f51703bbd4b3b931427911ab1801b88b55d"

RPROVIDES:${PN} += "config-coturn \
coturn \
group-coturn \
user-coturn"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
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
