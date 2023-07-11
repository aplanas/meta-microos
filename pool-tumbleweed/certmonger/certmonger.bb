SUMMARY = "Certificate status monitor and PKI enrollment client"
DESCRIPTION = "Certmonger is a service which is primarily concerned with getting your \
system enrolled with a certificate authority (CA) and keeping it enrolled."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.15"

RPM_NAME = "certmonger-0.79.15-1.6.aarch64.rpm"
RPM_HASH = "9c9b3514defe5e65f452f612ff1fca719e9b20ee48a3d1f010d374715c12494e3e588a490494cf5af74644902012c9c77b05516352b4310d6f9e35caade3585e"

RPROVIDES:${PN} += "certmonger \
config-certmonger"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libdbus-1.so.3 \
libidn2.so.0 \
libjansson.so.4 \
libkrb5.so.3 \
libldap.so.2 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libpopt.so.0 \
libresolv.so.2 \
libsmime3.so \
libtalloc.so.2 \
libtevent.so.0 \
libuuid.so.1 \
libxml2.so.2 \
sed \
systemd"

inherit rpm
