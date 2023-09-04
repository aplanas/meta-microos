SUMMARY = "An open source implementation of the Lightweight Directory Access Protocol"
DESCRIPTION = "OpenLDAP is a client and server reference implementation of the \
Lightweight Directory Access Protocol v3 (LDAPv3). \
 \
The server provides several database backends and overlays."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "fee805164de9c5f8b42abd13ee79530581d85988d8d4152b64d7efc7053478d305e60ee473d8d5b920c03f08cf1271e85787ed6a6a3b852f245d671c0b72b88b"

RPROVIDES:${PN} += "config-openldap2 \
group-ldap \
openldap2 \
user-ldap"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libldap2 \
libltdl.so.7 \
libsasl2.so.3 \
libslp.so.1 \
sysuser-shadow"

inherit rpm
