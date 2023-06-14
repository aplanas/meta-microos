SUMMARY = "Certificate status monitor and PKI enrollment client"
DESCRIPTION = "Certmonger is a service which is primarily concerned with getting your \
system enrolled with a certificate authority (CA) and keeping it enrolled."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.15"

RPM_NAME = "certmonger-0.79.15-1.5.aarch64.rpm"
RPM_HASH = "9f8fbd419552f5917e3d386f4ae0058862b44505c09b411ebfd4c7ad1318b8b6500cdb873c12a23a7b2576c4e65b3f6b5a53e087df42860ad16f848567fd7cc0"

RPROVIDES:${PN} += "certmonger \
config-certmonger"

RDEPENDS:${PN} += "/bin/sh \
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
