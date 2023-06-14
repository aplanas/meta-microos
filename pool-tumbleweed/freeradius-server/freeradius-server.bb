SUMMARY = "RADIUS Server"
DESCRIPTION = "Remote Authentication Dial-In User Service (RADIUS) is a networking \
protocol that provides centralized Authentication, Authorization, and \
Accounting (AAA or Triple A) management for users who connect and \
use a network service. \
 \
FreeRADIUS is a modular RADIUS implementation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "8b18b6a2b0a6a822a8e60ccd91bd28f2ba52359840622a56f49d725ef1c86bdafbe1b411fb28936615030ec632b059848051ebabb3c045a1610941cdb7a1308f"

RPROVIDES:${PN} += "config-freeradius-server \
freeradius \
freeradius-server \
radiusd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
