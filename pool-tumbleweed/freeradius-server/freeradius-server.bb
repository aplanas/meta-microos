SUMMARY = "RADIUS Server"
DESCRIPTION = "Remote Authentication Dial-In User Service (RADIUS) is a networking \
protocol that provides centralized Authentication, Authorization, and \
Accounting (AAA or Triple A) management for users who connect and \
use a network service. \
 \
FreeRADIUS is a modular RADIUS implementation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "4cd367d875d541ca0b6fa9641a74b1990ae247c5f18e2e9e75ef390fbd59edec8430c3866394cdb34b30043b8e31ba075f1cf089ded80bdc637d0ee844ce0285"

RPROVIDES:${PN} += "config-freeradius-server \
freeradius \
freeradius-server \
radiusd"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
freeradius-server-libs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libct.so.4 \
libcurl.so.4 \
libfreeradius-dhcp.so \
libfreeradius-eap.so \
libfreeradius-radius.so \
libfreeradius-server.so \
libgdbm.so.6 \
libjson-c.so.5 \
libmemcached.so.11 \
libodbc.so.2 \
libpam.so.0 \
libssl.so.3 \
libtalloc.so.2 \
libunbound.so.8 \
libwbclient.so.0 \
openssl \
perl \
pwdutils \
systemd"

inherit rpm
