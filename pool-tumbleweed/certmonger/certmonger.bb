SUMMARY = "Certificate status monitor and PKI enrollment client"
DESCRIPTION = "Certmonger is a service which is primarily concerned with getting your \
system enrolled with a certificate authority (CA) and keeping it enrolled."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.15"

RPM_NAME = "certmonger-0.79.15-1.5.aarch64.rpm"
RPM_HASH = "9f8fbd419552f5917e3d386f4ae0058862b44505c09b411ebfd4c7ad1318b8b6500cdb873c12a23a7b2576c4e65b3f6b5a53e087df42860ad16f848567fd7cc0"

RPROVIDES:${PN} += "certmonger \
certmonger(aarch-64) \
config(certmonger)"

RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libidn2.so.0()(64bit) \
libjansson.so.4()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libldap.so.2()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnssutil3.so()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libresolv.so.2()(64bit) \
libsmime3.so()(64bit) \
libtalloc.so.2()(64bit) \
libtevent.so.0()(64bit) \
libuuid.so.1()(64bit) \
libxml2.so.2()(64bit) \
sed \
systemd"

inherit rpm
