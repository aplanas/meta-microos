SUMMARY = "An open source implementation of the Lightweight Directory Access Protocol"
DESCRIPTION = "OpenLDAP is a client and server reference implementation of the \
Lightweight Directory Access Protocol v3 (LDAPv3). \
 \
The server provides several database backends and overlays."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "70fd3a11e19239678bc62f8e567887105ca1ec642fb745f0c81e3583264d92b096b3d058cc12b11bf54ae4c5bce68b19859acc6e67dc20e46f8f54c2a66bfb11"

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
