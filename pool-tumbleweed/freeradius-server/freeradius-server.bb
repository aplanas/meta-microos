SUMMARY = "RADIUS Server"
DESCRIPTION = "Remote Authentication Dial-In User Service (RADIUS) is a networking \
protocol that provides centralized Authentication, Authorization, and \
Accounting (AAA or Triple A) management for users who connect and \
use a network service. \
 \
FreeRADIUS is a modular RADIUS implementation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "a19f2d91c03d3eb42434d61a077cf313f75926b77ea727e1104ed13e4ba44a1621aa03c7f38bcde95a87726946ab4a54e6899f43e17ce493f9e6481b70fbd9ce"

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
libwbclient.so.0 \
openssl \
perl \
pwdutils \
systemd"

inherit rpm
