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

RPROVIDES:${PN} += "config(freeradius-server) \
freeradius \
freeradius-server \
freeradius-server(aarch-64) \
radiusd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
freeradius-server-libs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libct.so.4()(64bit) \
libcurl.so.4()(64bit) \
libfreeradius-dhcp.so()(64bit) \
libfreeradius-eap.so()(64bit) \
libfreeradius-radius.so()(64bit) \
libfreeradius-server.so()(64bit) \
libgdbm.so.6()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libmemcached.so.11()(64bit) \
libodbc.so.2()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libwbclient.so.0()(64bit) \
libwbclient.so.0(WBCLIENT_0.12)(64bit) \
libwbclient.so.0(WBCLIENT_0.9)(64bit) \
openssl \
perl \
pwdutils \
systemd"

inherit rpm
